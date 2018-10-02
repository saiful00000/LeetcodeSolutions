package maths;

public class Leetcode_204_CountPrime {

    public static int countPrimes(int n) {

        boolean[] dp = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (dp[i]) continue;
            count++;
            for (int j = i; j < n; j = j+i) {
                dp[j] = true;
            }
        }

        return count;
    }
}
