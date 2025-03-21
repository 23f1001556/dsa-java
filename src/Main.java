import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        // Call methods for each data structure
        ArrayListOperations();
        LinkedListOperations();
        HashSetOperations();
        TreeSetOperations();
        LinkedHashSetOperations();
        PriorityQueueOperations();
        HashMapOperations();
        TreeMapOperations();
        LinkedHashMapOperations();
    }

    // ArrayList Operations
    public static void ArrayListOperations() {
        System.out.println("ArrayList Operations:");

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Programming");

        // Add, Get, Remove, and other operations
        System.out.println("List: " + list);
        list.add(1, "NewElement");
        System.out.println("After adding at index 1: " + list);
        System.out.println("Element at index 2: " + list.get(2));
        list.remove("Java");
        System.out.println("After removing 'Java': " + list);
        list.remove(0);  // Removes element at index 0
        System.out.println("After removing element at index 0: " + list);
        System.out.println("Contains 'World': " + list.contains("World"));
        System.out.println("Size of list: " + list.size());
        System.out.println("Is list empty: " + list.isEmpty());

        // Check if the list contains all elements of another collection
        ArrayList<String> anotherList = new ArrayList<>();
        anotherList.add("World");
        anotherList.add("Programming");
        System.out.println("List contains all elements of another list: " + list.containsAll(anotherList));

        // Sublist (from index 1 to 3)
        System.out.println("Sublist from index 1 to 3: " + list.subList(1, 3));

        // Set a value at a specific index
        list.set(1, "UpdatedElement");
        System.out.println("After setting element at index 1: " + list);

        // Iterator
        Iterator<String> iterator = list.iterator();
        System.out.print("Iterating through list: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Clear all elements
        list.clear();
        System.out.println("After clear operation: " + list);
        System.out.println("---------------");
    }

    // LinkedList Operations
    public static void LinkedListOperations() {
        System.out.println("LinkedList Operations:");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Node1");
        linkedList.add("Node2");
        linkedList.add("Node3");

        // Add, Get, Remove, and other operations
        System.out.println("LinkedList: " + linkedList);
        linkedList.addFirst("FirstNode");
        linkedList.addLast("LastNode");
        System.out.println("After adding first and last: " + linkedList);
        System.out.println("Get first element: " + linkedList.getFirst());
        System.out.println("Get last element: " + linkedList.getLast());
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("After removing first and last: " + linkedList);

        // Remove by index
        linkedList.remove(0);  // Remove element at index 0
        System.out.println("After removing element at index 0: " + linkedList);

        // Offer elements to the LinkedList (acts as a Queue)
        linkedList.offer("NewNode");
        System.out.println("After offering a new element: " + linkedList);

        // Peek (get the first element without removing it)
        System.out.println("Peek first element: " + linkedList.peekFirst());

        // Poll (get and remove the first element)
        System.out.println("Poll first element: " + linkedList.pollFirst());

        // Check if the list contains a specific element
        System.out.println("Contains 'Node3': " + linkedList.contains("Node3"));

        // Is empty
        System.out.println("Is LinkedList empty: " + linkedList.isEmpty());

        // Convert to array
        Object[] array = linkedList.toArray();
        System.out.println("Array from LinkedList: " + Arrays.toString(array));

        // Clear all elements
        linkedList.clear();
        System.out.println("After clear operation: " + linkedList);
        System.out.println("---------------");
    }

    // HashSet Operations
    public static void HashSetOperations() {
        System.out.println("HashSet Operations:");

        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Add, Remove, Contains, and other operations
        System.out.println("HashSet: " + set);
        set.add("Date");
        set.remove("Banana");
        System.out.println("After adding and removing elements: " + set);
        System.out.println("Contains 'Cherry': " + set.contains("Cherry"));
        System.out.println("Size of HashSet: " + set.size());

        // Iteration using for-each
        System.out.print("Iterating through HashSet: ");
        for (String fruit : set) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Is empty
        System.out.println("Is HashSet empty: " + set.isEmpty());

        // Clone HashSet (create a shallow copy)
        HashSet<String> clonedSet = (HashSet<String>) set.clone();
        System.out.println("Cloned HashSet: " + clonedSet);

        // Clear all elements
        set.clear();
        System.out.println("After clear operation: " + set);
        System.out.println("---------------");
    }

    // TreeSet Operations
    public static void TreeSetOperations() {
        System.out.println("TreeSet Operations:");

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(15);

        // Add, Remove, and other operations
        System.out.println("TreeSet: " + treeSet);
        treeSet.add(5);
        treeSet.remove(20);
        System.out.println("After adding and removing elements: " + treeSet);
        System.out.println("Contains 15: " + treeSet.contains(15));
        System.out.println("Size of TreeSet: " + treeSet.size());
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // HeadSet (elements less than the specified element)
        System.out.println("HeadSet less than 15: " + treeSet.headSet(15));

        // TailSet (elements greater than or equal to the specified element)
        System.out.println("TailSet greater than or equal to 15: " + treeSet.tailSet(15));

        // Is empty
        System.out.println("Is TreeSet empty: " + treeSet.isEmpty());

        // Convert to array
        Integer[] array = treeSet.toArray(new Integer[0]);
        System.out.println("Array from TreeSet: " + Arrays.toString(array));

        // Clear all elements
        treeSet.clear();
        System.out.println("After clear operation: " + treeSet);
        System.out.println("---------------");
    }

    // LinkedHashSet Operations
    public static void LinkedHashSetOperations() {
        System.out.println("LinkedHashSet Operations:");

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Red");
        linkedHashSet.add("Green");
        linkedHashSet.add("Blue");

        // Add, Remove, and other operations
        System.out.println("LinkedHashSet: " + linkedHashSet);
        linkedHashSet.add("Yellow");
        linkedHashSet.remove("Green");
        System.out.println("After adding and removing elements: " + linkedHashSet);
        System.out.println("Contains 'Red': " + linkedHashSet.contains("Red"));
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        // Iteration using for-each
        System.out.print("Iterating through LinkedHashSet: ");
        for (String color : linkedHashSet) {
            System.out.print(color + " ");
        }
        System.out.println();

        // Is empty
        System.out.println("Is LinkedHashSet empty: " + linkedHashSet.isEmpty());

        // Clear all elements
        linkedHashSet.clear();
        System.out.println("After clear operation: " + linkedHashSet);
        System.out.println("---------------");
    }

    // PriorityQueue Operations
    public static void PriorityQueueOperations() {
        System.out.println("PriorityQueue Operations:");

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);

        // Add, Peek, Poll and other operations
        System.out.println("PriorityQueue: " + pq);
        System.out.println("Peek element: " + pq.peek());
        System.out.println("Poll element: " + pq.poll());
        System.out.println("After poll: " + pq);
        pq.add(5);
        System.out.println("After adding 5: " + pq);
        System.out.println("Size of PriorityQueue: " + pq.size());

        // Is empty
        System.out.println("Is PriorityQueue empty: " + pq.isEmpty());

        // Clear all elements
        pq.clear();
        System.out.println("After clear operation: " + pq);
        System.out.println("---------------");
    }

    // HashMap Operations
    public static void HashMapOperations() {
        System.out.println("HashMap Operations:");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Put, Get, Remove, ContainsKey, and other operations
        System.out.println("HashMap: " + map);
        map.put("Four", 4);
        map.remove("Two");
        System.out.println("After adding and removing: " + map);
        System.out.println("Get value for 'One': " + map.get("One"));
        System.out.println("Contains key 'Three': " + map.containsKey("Three"));
        System.out.println("Contains value 4: " + map.containsValue(4));
        System.out.println("Size of HashMap: " + map.size());

        // Check if map is empty
        System.out.println("Is HashMap empty: " + map.isEmpty());

        // Iterate over map entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Clear all entries
        map.clear();
        System.out.println("After clear operation: " + map);
        System.out.println("---------------");
    }

    // TreeMap Operations
    public static void TreeMapOperations() {
        System.out.println("TreeMap Operations:");

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        // Put, Get, Remove, and other operations
        System.out.println("TreeMap: " + treeMap);
        treeMap.put("Four", 4);
        treeMap.remove("Two");
        System.out.println("After adding and removing: " + treeMap);
        System.out.println("Get value for 'One': " + treeMap.get("One"));
        System.out.println("First entry: " + treeMap.firstEntry());
        System.out.println("Last entry: " + treeMap.lastEntry());

        // HeadMap (elements less than the specified key)
        System.out.println("HeadMap less than 'Three': " + treeMap.headMap("Three"));

        // TailMap (elements greater than or equal to the specified key)
        System.out.println("TailMap greater than or equal to 'Two': " + treeMap.tailMap("Two"));

        // Clear all entries
        treeMap.clear();
        System.out.println("After clear operation: " + treeMap);
        System.out.println("---------------");
    }

    // LinkedHashMap Operations
    public static void LinkedHashMapOperations() {
        System.out.println("LinkedHashMap Operations:");

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);

        // Put, Get, Remove, and other operations
        System.out.println("LinkedHashMap: " + linkedHashMap);
        linkedHashMap.put("Four", 4);
        linkedHashMap.remove("Two");
        System.out.println("After adding and removing: " + linkedHashMap);
        System.out.println("Get value for 'One': " + linkedHashMap.get("One"));
        System.out.println("Contains key 'Three': " + linkedHashMap.containsKey("Three"));
        System.out.println("Size of LinkedHashMap: " + linkedHashMap.size());

        // Iterate over map entries
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Clear all entries
        linkedHashMap.clear();
        System.out.println("After clear operation: " + linkedHashMap);
        System.out.println("---------------");
    }
}
