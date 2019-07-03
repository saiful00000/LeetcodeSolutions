package Stack;

import java.util.Stack;

public class LeetCode_844_BackspaceStringCompare {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("y#fo##f", "y#f#o##f"));
    }

    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '#' && !sStack.isEmpty()) {
                sStack.pop();
            } else if(c != '#') {
                sStack.push(c);
            }
        }

        for (int i = 0; i < T.length(); i++) {
            char c = T.charAt(i);
            if (c == '#' && !tStack.isEmpty()) {
                tStack.pop();
            } else if (c != '#'){
                tStack.push(c);
            }
        }

        if (sStack.size() == tStack.size()) {
            while (!sStack.empty()) {
                if (sStack.pop() != tStack.pop()) {
                    return false;
                }
            }
        }else {
            return false;
        }

        return true;
    }

}
