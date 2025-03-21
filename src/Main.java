
    import java.util.*;
    public class Main {

        public static void main(String[] args) {

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
            System.out.println("Contains 'World': " + list.contains("World"));
            System.out.println("Size of list: " + list.size());
            System.out.println("Is list empty: " + list.isEmpty());
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
            System.out.println("Is list empty: " + linkedList.isEmpty());
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
            System.out.println("Is set empty: " + set.isEmpty());
            set.clear();
            System.out.println("After clearing set: " + set);
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
            System.out.println("---------------");
        }
    }
