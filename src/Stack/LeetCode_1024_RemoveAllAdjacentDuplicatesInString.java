package Stack;

import java.util.Stack;

public class LeetCode_1024_RemoveAllAdjacentDuplicatesInString {

    // 245 ms runtime solution
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            if (!stack.isEmpty()) {
                if (c == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }

        s = "";
        for (char c: stack)
            s += c;

        return s;
    }

    public static void main(String[] args) {
        String s = "abcdefghabcdefgh";
        System.out.println(removeDuplicates(s));
    }
}
