package arraylisttut;

import java.util.Collections;
import java.util.Scanner;

public class arraylistut2 {
    public static void main(String[] args) {
        //Create an ArrayList and add some colors (strings). Print the collection
        ArrayList<Strings>list=new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");
        list.add("yellow");
        System.out.println(list);
        //Iterate through all elements in an ArrayList
        for(String l:list){
            System.out.println(l);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list[i]);
        }
        //Insert an element at a specific position in an ArrayList
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nposition to enter between 0-3");
        int n=sc.nextInt();
        System.out.println("enter the colour name");
        String colour=sc.next();
        list.add(n,colour);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
