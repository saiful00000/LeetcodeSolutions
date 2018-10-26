package LinkedList;

public class Leetcode_234_PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast != null) slow = slow.next; // for odd nodes right half will smaller

        slow = revrseHalf(slow);
        fast = head;

        while (slow != null) {
            if (slow.val != fast.val)
                return false;
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }

    public ListNode revrseHalf(ListNode node) {
        ListNode prev = null;
        while (node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
}
