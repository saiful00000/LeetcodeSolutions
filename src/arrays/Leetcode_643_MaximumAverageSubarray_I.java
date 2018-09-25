package arrays;

import java.util.Map;

public class Leetcode_643_MaximumAverageSubarray_I {

    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int[] sums = new int[n];
        sums[0] = nums[0];

        for (int i = 1; i < n; i++) {
            sums[i] = sums[i-1] + nums[i];
        }
        double max = sums[k-1] * 1.0 / k;
        for (int i = k,j=0; i < n; i++) {
            max = Math.max(max, (sums[i] - sums[i-k])*1.0/k);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {5};
        System.out.println(findMaxAverage(a,1));
    }
}
