package stacktut;
import java.util.Stack;
public class stacktut2 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        String str = "hello what is your name";
        ReverseStack(stack, str);
        String parenthesis1="[{({])";
        String parenthesis2="[([)]}";
        boolean result1= parenthesesCheck(stack,parenthesis1);
        boolean result2= parenthesesCheck(stack,parenthesis2);
        System.out.println(result1);
        System.out.println(result2);
    }
    //reversing string using stack
    public static void ReverseStack(Stack<Character> stack,String s) {
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        for(int i=stack.size()-1;i>=0;i--){
            System.out.print(stack.pop());
        }
    }
    //checking balanced paranthesis
    public static boolean parenthesesCheck(Stack<Character> stack, String s) {
        for (char ch : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else {
                // If the stack is empty, there is no corresponding opening bracket
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the top element from the stack
                char top = stack.pop();

                // Check if the popped character matches the corresponding opening bracket
                if ((ch == ']' && top != '[') ||
                        (ch == '}' && top != '{') ||
                        (ch == ')' && top != '(')) {
                    return false;
                }
            }
        }

        // Return true if stack is empty (all opening brackets have been matched)
        return stack.isEmpty();
    }

}
