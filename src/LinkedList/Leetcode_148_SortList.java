package LinkedList;

import java.util.List;

public class Leetcode_148_SortList {

    public ListNode sortList(ListNode head) {
        // base case
        if (head == null || head.next == null)
            return head;

        ListNode middle = getMiddle(head);
        ListNode middleNext = middle.next;
        middle.next = null;

        ListNode firstHalf = sortList(head);
        ListNode secondHalf = sortList(middleNext);

        ListNode sortedList = marge(firstHalf, secondHalf);

        return sortedList;
    }

    public ListNode marge(ListNode left, ListNode right) {
        ListNode sortedList = null;

        // base case
        if (left == null) return right;
        if (right == null) return left;

        if (left.val <= right.val) {
            sortedList = left;
            sortedList.next = marge(left.next, right);
        } else {
            sortedList = right;
            sortedList.next = marge(left,right.next);
        }

        return sortedList;
    }

    public ListNode getMiddle(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }
}
