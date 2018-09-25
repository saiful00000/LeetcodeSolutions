package arrays;

import java.util.Arrays;

public class Leetcode_628_MaximumProductOfThreeNumbers {
    public static int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int maxProd = Math.max(nums[0]*nums[1]*nums[n-1], nums[n-3]*nums[n-2]*nums[n-1]);
        return maxProd;
    }
}
