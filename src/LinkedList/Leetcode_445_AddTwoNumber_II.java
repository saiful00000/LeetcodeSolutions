package LinkedList;

public class Leetcode_445_AddTwoNumber_II {
    ListNode resultList;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1 = "", s2 = "", resultString;

        while (l1 != null) {
            s1 += Integer.toString(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2 += Integer.toString(l2.val);
            l2 = l2.next;
        }

        long sum = Long.parseLong(s1) + Long.parseLong(s2);
        resultString = Long.toString(sum);
        char[] ch = resultString.toCharArray();
        for (int i = ch.length-1; i >= 0 ; i--) {
            int value = Integer.parseInt(String.valueOf(ch[i]));
            addFront(value);
        }

        return resultList;
    }

    public void addFront(int val) {
        ListNode newList = new ListNode(val);
        newList.next = resultList;
        resultList = newList;
    }

}
