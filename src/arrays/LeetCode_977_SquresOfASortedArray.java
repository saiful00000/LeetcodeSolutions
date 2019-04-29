package arrays;

import java.util.Arrays;

public class LeetCode_977_SquresOfASortedArray {

    public static int[] sortedSquares(int[] array) {

        int len = array.length;
        int result[] = new int[len];
        result[0] = (int) Math.pow(array[0], 2);

        result[0] = (int) Math.pow(array[0], 2);
        for (int i = 1; i < len; i++) {
            int p = (int) Math.pow(array[i], 2);
            result[i] = p;
            if (result[i] < result[i - 1]) {
                int x = i;
                while (x > 0 && result[x] < result[x-1]) {
                    int temp = result[x];
                    result[x] = result[x-1];
                    result[x-1] = temp;
                    x--;
                }
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
