package DynamicProgramming;

public class Leetcode_647_PelindromicSubstring {
    int count = 1;
    public int countSubstrings(String s) {
        int n = s.length();
        if (n < 1) return 0;

        for (int i = 0; i < n-1; i++) {
            countSub(s, i, i);
            countSub(s, i,i+1);
        }
        return count;
    }

    public void countSub(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            count++;
            i--;
            j++;
        }
    }
}
