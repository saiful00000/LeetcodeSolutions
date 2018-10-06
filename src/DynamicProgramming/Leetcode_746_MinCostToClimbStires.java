package DynamicProgramming;

public class Leetcode_746_MinCostToClimbStires {
    public int minCostClimbingStairs(int[] nums) {
        int min1 = nums[0];
        int min2 = nums[1];

        for (int i = 2; i < nums.length; i++) {
            int min_now = nums[i] + Math.min ( min1 , min2 );
            min1 = min2;
            min2 = min_now;
        }
        return min1 < min2 ? min1 : min2;
    }
}