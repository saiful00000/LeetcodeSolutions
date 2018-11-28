package Contests.VirtualContest_02;

public class Problem_01_Leetcode_504 {
    public static void main(String[] args) {
        int n = -8;
        System.out.println(convertToBase7(n));
    }

    public static String convertToBase7(int n) {
        if (n == 0) return "0";
        StringBuilder s = new StringBuilder();
        boolean isNegative = n < 0 ? true : false;

        while (n != 0) {
            s.append(Math.abs(n % 7));
            n /= 7;
        }

        if (isNegative)
            s.append("-");
        return s.reverse().toString();
    }
}
