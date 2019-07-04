package maths;

public class LeetCode_172_FactorialTrailingZerose {

    public static void main(String[] args) {
        int n = 100;

        System.out.println(trailingZeroes(n));
    }

    public static int trailingZeroes(int n) {

        if (n < 1)
            return 0;

        return n/5 + trailingZeroes(n/5);

    }

}
