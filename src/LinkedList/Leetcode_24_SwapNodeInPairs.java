package LinkedList;

public class Leetcode_24_SwapNodeInPairs {
    public ListNode swapPairs(ListNode head) {
        /*ListNode demo = new ListNode(0);
        demo.next = head;
        ListNode node = demo;

        while (node.next != null || node.next.next != null) {
            ListNode one = node.next;
            ListNode two = node.next.next;
            one.next = two.next;
            node.next = two;
            node.next.next = one;
            node = node.next.next;
        }
        return demo.next;*/
        ListNode demo = new ListNode(0);
        demo.next = head;
        ListNode current = demo;
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return demo.next;
    }
}
