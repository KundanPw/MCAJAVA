import java.util.*;

public class StackQuestions {
    public static void pushAtBottom(Stack<Integer> s, int data) {   // Q1. Push at the bottom of the stack
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str) {  // Q2. Reverse a string using a stack
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()) {
            char curr=s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void reverseStack(Stack<Integer> s) {   // Q3. Reverse a stack
        if(s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        while (!s.isEmpty()) {
            int curr = s.pop();
            System.out.println(curr);
            temp.push(curr);
        }

        while(!temp.isEmpty()) {
            s.push(temp.pop());
        }
    }

    public static void main(String args[]) {
       Stack<Integer> s = new Stack<>();
       s.push(1);
       s.push(2);
       s.push(3);
       System.out.println("Original stack item");
       printStack(s);
       reverseStack(s);
       System.out.println("Reverse stack item");
       printStack(s);
    }
}
