package Stack;

public class Leetcode_155_MinStack {
    Stack stack;
    class Stack{
        int data;
        Stack next;
        Stack(int data){
            this.data = data;
            next = null;
        }
    }

    public void push(int x) {
        Stack current = new Stack(x);
        current.next = stack;
        stack = current;
    }

    public void pop() {
        if (stack != null) stack = stack.next;
    }

    public int top() {
        return stack.data;
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        Stack temp = stack;
        while(temp != null){
            if(min >  temp.data){
                min = temp.data;
            }
            temp = temp.next;
        }
        return min;
    }
}
