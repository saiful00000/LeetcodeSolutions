package BinarySearch;

import java.util.Arrays;

public class Leetcode_287_Find_the_Duplicate_Number {
    private static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1])
                return nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        System.out.println(findDuplicate(nums));
    }
}
