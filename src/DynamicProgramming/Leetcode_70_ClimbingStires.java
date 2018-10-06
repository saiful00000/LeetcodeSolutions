package DynamicProgramming;

public class Leetcode_70_ClimbingStires {

    public int climbStairs(int n) {
        if (n <= 1) return 1;

        int[] dp = {0,1};
        for (int i = 0; i < n; i++) {
            int tempo = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = tempo;
        }
        return dp[1];
    }
}
