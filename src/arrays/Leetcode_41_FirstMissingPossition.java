package arrays;

import java.util.Arrays;

public class Leetcode_41_FirstMissingPossition {

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        if (n < 1)
            return 1;

        Arrays.sort(nums);

        int j = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) continue;

            if (nums[i] > j) return j;

            if(nums[i] == j){
                j = nums[i] + 1;
                continue;
            }
        }
        return nums[n-1]+1;
    }
    public static void main(String[] args) {
        int[] a = {4,3,4,1,1,4,1,4};
        System.out.println(firstMissingPositive(a));
    }
}
