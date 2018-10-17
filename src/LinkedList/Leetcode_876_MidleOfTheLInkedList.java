package LinkedList;

public class Leetcode_876_MidleOfTheLInkedList {
    /*class ListNode{
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            next = null;
        }
    }*/

    public ListNode middleNode(ListNode head) {
        ListNode midle = head, end = head;
        while (end.next != null) {
            midle = midle.next;
            end = end.next.next;
        }
        return midle;
    }
}
