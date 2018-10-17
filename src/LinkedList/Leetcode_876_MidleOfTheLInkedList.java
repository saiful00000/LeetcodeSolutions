package LinkedList;

public class Leetcode_876_MidleOfTheLInkedList {

    public ListNode middleNode(ListNode head) {
        ListNode midle = head, end = head;
        while (end.next != null) {
            midle = midle.next;
            end = end.next.next;
        }
        return midle;
    }
}
