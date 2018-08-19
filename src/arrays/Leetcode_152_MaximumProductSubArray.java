package arrays;

public class Leetcode_152_MaximumProductSubArray {

    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int[] max = new int[n];
        int[] min = new int[n];
        int product = nums[0];
        max[0] = min[0] = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] > 0) {
                max[i] = Math.max(nums[i], max[i - 1] * nums[i]);
                min[i] = Math.min(nums[i], min[i - 1] * nums[i]);
            } else {
                max[i] = Math.max(nums[i], min[i-1] * nums[i]);
                min[i] = Math.min(nums[i], max[i-1] * nums[i]);
            }
            product = Math.max(product, max[i]);
        }
        return product;
    }

}
