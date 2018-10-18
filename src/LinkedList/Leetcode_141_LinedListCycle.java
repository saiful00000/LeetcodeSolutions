package LinkedList;

public class Leetcode_141_LinedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast.next != null && fast.next.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
