package DynamicProgramming;

public class Leetcode_300_LongestComonSubsequence {

    public int longestOfLIS(int[] nums) {
        int n = nums.length;
        int max = 0;
        int[] LIS = new int[n];

        for (int i = 0; i < n; i++)
            LIS[i] = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && LIS[i] < LIS[j]+1)
                    LIS[i] = LIS[j]+1;
            }
        }
        for (int v : LIS) {
            if (max < v) max = v;
        }

        return max;
    }
}
