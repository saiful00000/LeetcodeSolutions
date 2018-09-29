package arrays;

public class Leetcode_45_JumpGame_II {

    public static int jump(int[] nums) {
        if (nums.length == 0 || nums[0] == 0)
            return 0;

        int[] dp = new int[nums.length];
        dp[0] = 0;

        for (int i = 1; i < nums.length; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (i <= nums[j] + j && dp[j] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[j]+1);
                    break;
                }
            }
        }
        return dp[nums.length-1];
    }


    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(jump(a));
    }

}
