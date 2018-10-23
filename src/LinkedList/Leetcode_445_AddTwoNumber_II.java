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

        char[] ch1 = s1.toCharArray(); int n1 = ch1.length-1;
        char[] ch2 = s2.toCharArray(); int n2 = ch2.length-1;
        int cary = 0;
        while (n1 >= 0 || n2 >= 0) {
            if (n1 < 0) {
                int sum = Integer.parseInt(String.valueOf(ch2[n2])) + cary;
                String strSum = Integer.toString(sum);
                if (strSum.length() == 2) {
                    addFront(Integer.parseInt(String.valueOf(strSum.charAt(1))));
                    cary = 1;
                } else {
                    addFront(Integer.parseInt(strSum));
                    cary = 0;
                }
                n2--;
            } else if (n2 < 0) {
                int sum = Integer.parseInt(String.valueOf(ch1[n1])) + cary;
                String strSum = Integer.toString(sum);
                if (strSum.length() == 2) {
                    addFront(Integer.parseInt(String.valueOf(strSum.charAt(1))));
                    cary = 1;
                } else {
                    addFront(Integer.parseInt(strSum));
                    cary = 0;
                }
                n1--;
            } else {
                int sum = cary + Integer.parseInt(String.valueOf(ch1[n1])) + Integer.parseInt(String.valueOf(ch2[n2]));
                String strSum = Integer.toString(sum);
                if (strSum.length() == 2) {
                    addFront(Integer.parseInt(String.valueOf(strSum.charAt(1))));
                    cary = 1;
                } else {
                    addFront(Integer.parseInt(strSum));
                    cary = 0;
                }
                n1--;n2--;
            }
        }
        if (cary == 1) {
            addFront(1);
        }
        return resultList;
    }

    public void addFront(int val) {
        ListNode newList = new ListNode(val);
        newList.next = resultList;
        resultList = newList;
    }
}
