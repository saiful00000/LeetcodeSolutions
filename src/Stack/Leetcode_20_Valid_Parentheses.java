package Stack;

import java.util.Stack;

public class Leetcode_20_Valid_Parentheses {

    public static boolean isValid(String parentheses) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < parentheses.length(); i++) {
            char c = parentheses.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                if (c == ')' && stack.peek() == '(') stack.pop();
                else if (c == '}' && stack.peek() == '{') stack.pop();
                else if (c == ']' && stack.peek() == '[') stack.pop();
                else return false;
            } else {
                return false;
            }

        }
        return stack.isEmpty() ? true : false;
    }

    public static void main(String[] args) {
        String s = "}";
        System.out.println(isValid(s));
    }
}
