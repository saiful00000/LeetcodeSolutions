package arrays;

import java.util.Arrays;

public class Leetcode_922_SortArrayBYParity_II {
    public static int[] sortArrayByParityII(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int even = 0;
        int odd = 1;
        int i = 0;
        for (int v:nums) {
            if (v % 2 == 0) {
                result[even] = v;
                even += 2;
            } else {
                result[odd] = v;
                odd += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,4};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }
}
