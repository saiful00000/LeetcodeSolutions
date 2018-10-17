package DynamicProgramming;

public class Leetcode_413_ArithmeticSlices {

    public int numberOfArithmeticSlices(int[] nums) {
        int dp = 0;
        int sum = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                dp = 1 + dp;
                sum += dp;
            } else {
                dp = 0;
            }
        }
        return sum;
    }
}
