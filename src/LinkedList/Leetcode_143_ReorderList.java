package LinkedList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Leetcode_143_ReorderList {

    ListNode resultNode;

    public void reorderList(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) return;

        int halfLen, len = 0;
        ListNode  fast = head;

        while (fast != null) {
            len++; fast = fast.next;
        }

        if (len%2 == 0) halfLen = len/2;
        else halfLen = (len/2) + 1;

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        ListNode list = head;
        int i = 1;

        while (i <= halfLen) {
            stack.push(list.val);
            list = list.next;
            i++;
        }
        while (list != null) {
            queue.add(list.val);
            list = list.next;
        }

        if (len % 2 == 0) {
            addFront(queue.remove());
            addFront(stack.pop());
        }else {
            addFront(stack.pop());
            addFront(queue.remove());
        }

        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (!queue.isEmpty()) {
                addFront(stack.pop());
            } else if (!stack.isEmpty()) {
                addFront(queue.remove());
            } else {
                if (len % 2 == 0) {
                    addFront(queue.remove());
                    addFront(stack.pop());
                }else {
                    addFront(stack.pop());
                    addFront(queue.remove());
                }
            }
        }
        head = resultNode;
    }

    public void addFront(int val) {
        ListNode node = new ListNode(val);
        node.next = resultNode;
        resultNode = node;
    }
}
