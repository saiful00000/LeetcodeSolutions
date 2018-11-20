package DivideAndConquer;

public class Leetcode_53_Maximum_Subarray {

    public static int maxSubArray(int[] nums) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            if (sum < 0) {
                maxSum = Math.max(maxSum, sum);
                sum = 0;

            } else if (maxSum < sum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] a = {-1};
        System.out.println(maxSubArray(a));
    }
}
