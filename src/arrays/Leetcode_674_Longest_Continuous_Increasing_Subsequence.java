package arrays;

public class Leetcode_674_Longest_Continuous_Increasing_Subsequence {
    private int findLengthOfLCIS(int[] nums) {
        int counter = 1;
        int longest = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < nums[i + 1]) {
                counter++;
            } else {
                longest = Math.max(longest, counter);
                counter = 1;
            }
        }
        return Math.max(longest,counter);
    }
}
