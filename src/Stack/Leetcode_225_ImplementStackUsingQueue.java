package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_225_ImplementStackUsingQueue {

    class MyStack{

        Queue<Integer> q = new LinkedList<>();

        /** Initialize your data structure here. */
        public MyStack() {

        }

        /** Push element x onto stack. */
        public void push(int x) {
            q.add(x);
            int n = q.size();
            while(n>1){
                q.add(q.remove());
                n--;
            }
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return q.remove();
        }

        /** Get the top element. */
        public int top() {
            return q.peek();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return q.isEmpty();
        }
    }


}
