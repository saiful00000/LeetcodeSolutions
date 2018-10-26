package LinkedList;

public class Leetcode_2_AddTwoNumbers {
    ListNode resultNode;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        int cary = 0;
        String sum = "";

        while (l1 != null && l2 != null) {
            if (l1 == null) {
                String sm = Integer.toString(l2.val + cary);
                if (sm.length() == 2) {
                    sum += sm.charAt(1);
                    cary = 1;
                } else {
                    sum += sm;
                    cary = 0;
                }

            } else if (l2 == null) {
                String sm = Integer.toString(l1.val + cary);
                if (sm.length() == 2) {
                    sum += sm.charAt(1);
                    cary = 1;
                } else {
                    sum += sm;
                    cary = 0;
                }
            } else {
                String sm = Integer.toString((l1.val + l2.val)+cary);
                if (sm.length() == 2) {
                    sum += sm.charAt(1);
                    cary = 1;
                } else {
                    sum += sm;
                    cary = 0;
                }
            }
        }
        if (cary == 1) sum += "1";

        for (int i = sum.length()-1; i >= 0 ; i++) {
            addFront(Integer.parseInt(String.valueOf(sum.charAt(i))));
        }

        return resultNode;
    }

    public void addFront(int val){
        ListNode node = new ListNode(val);
        node.next = resultNode;
        resultNode = node;
    }
}
