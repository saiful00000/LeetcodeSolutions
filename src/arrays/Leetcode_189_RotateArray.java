package arrays;

public class Leetcode_189_RotateArray {

    public static void rotate(int[] nums, int k) {
        int[] newNums = new int[nums.length];
        for (int i = 0; i < newNums.length; i++) {
            newNums[(i+k)%nums.length] = nums[i];
        }
        for (int i = 0; i < newNums.length; i++) {
            nums[i] = newNums[i];
        }
    }
}
