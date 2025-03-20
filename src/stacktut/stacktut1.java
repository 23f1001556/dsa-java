package stacktut;
import java.util.Stack;
public class stacktut1 {
    public static void main(String args[]){
        Stack<Integer>stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        System.out.println("removed element from stack"+stack.pop());
        System.out.println(stack);
        System.out.println("top element of  stack : "+stack.peek());
        StaticString();
    }
    public static void StaticString(){
        Stack<String>stack1=new Stack<>();
        stack1.push("Hello");
        stack1.push("World");
        stack1.push("!");
        System.out.println(stack1);
    }
}
