package arrays;

import java.util.Arrays;

public class Leetcode_238_Product_of_Array_Except_Self {
    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        if (len == 0) return new int[0];
        int[] result = new int[len];
        int temp = 1;
        for (int i = 0; i < len; i++) {
            result[i] = temp;
            temp *= nums[i];
        }
        temp = 1;
        for (int i = len - 1; i >= 0; i--) {
            result[i] *= temp;
            temp *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
