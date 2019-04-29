package arrays;

import java.util.Arrays;

public class LeetCode_977_SquresOfASortedArray {

    public static int[] sortedSquares(int[] array) {
        int len = array.length;
        int result[] = new int[len];
        int left = 0;
        int right = len-1;

        for (int i = len-1; i >= 0; i--) {
            if (Math.abs(array[left]) > Math.abs(array[right])) {
                result[i] = array[left] * array[left];
                left++;
            } else {
                result[i] = array[right] * array[right];
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {-7,-3,2,3,11};
        int[] result = sortedSquares(array);
        System.out.println(Arrays.toString(result));
    }

}
