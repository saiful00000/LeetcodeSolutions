package Stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Leetcode_946_Valid_STack_Sequences {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new LinkedList<>();
        int n = pushed.length;
        int i = 0;
        for (int v:pushed) {
            stack.offerLast(v);
            while (!stack.isEmpty() && i < n && popped[i] == stack.peekLast()) {
                stack.pollLast();
                i++;
            }
        }
        return i == n ? true : false;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        int b[] = {9,8,7,6,5,4,3,1,2};
        System.out.println(validateStackSequences(a,b));
    }
}
