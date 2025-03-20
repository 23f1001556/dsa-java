package arraylisttut;
import java.util.ArrayList;
import java.util.Collections;

public class arraylistut1 {
    public static void main(String[] args) {
        ArrayList<String>arraylist=new ArrayList<>();
        arraylist.add("apple");
        arraylist.add("mango");
        arraylist.add("banana");
        System.out.println(arraylist);
        arraylist.add(0,"onion");
        System.out.println(arraylist);
        System.out.println(arraylist.get(2));
        arraylist.remove(2);
        System.out.println(arraylist);
        System.out.println("size of arraylist is: "+arraylist.size());
        System.out.println("checking for item presence: "+arraylist.contains("apple"));
        Sortingarraylist();
    }
    public static void Sortingarraylist(){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(54);
        list.add(65);
        list.add(52);
        list.add(45);
        list.add(42);
        list.add(4682);
        System.out.println(list);
        System.out.println("sorting in ascending");
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
