package arrays;

import java.util.ArrayList;

public class Leetcode_209_MinimumSizeSubArraySum {
    public static int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0)
            return 0;

        int i = 0, j = 0, sum = 0;
        int min = Integer.MAX_VALUE;

        while (j < nums.length) {
            sum += nums[j++];

            while (sum >= s) {
                min = Math.min(min, j-i);
                sum -= nums[i++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        int[] a = {2,3,1,2,4,3};
        int s = 7;
        System.out.println(minSubArrayLen(s,a));
    }
}
