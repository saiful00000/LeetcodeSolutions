package arrays;

import java.util.Arrays;

public class Leetcode_747_LongestNumberAtLeastTweiceOfOthers {

    public static int dominantIndex(int[] nums) {
        int n = nums.length;
        int index = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] >= max) {
                max = nums[i];
                index = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != max) {
                if ((nums[i] * 2) <= max) {
                    continue;
                } else {
                    return -1;
                }
            }
        }
        return index;
    }
    /*public static void main(String[] args) {
        int[] a = {1,2,16,35,44,100,27,0};
        System.out.println(dominantIndex(a));
    }*/
}
