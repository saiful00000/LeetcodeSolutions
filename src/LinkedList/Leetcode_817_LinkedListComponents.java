package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_817_LinkedListComponents {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> set = new HashSet<>();
        for (int v:G) set.add(v);
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            if (set.contains(temp.val) && (temp.next == null || !set.contains(temp.next.val)))
                count++;
            temp = temp.next;
        }
        return count;
    }
}