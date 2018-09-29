package arrays;

public class Leetcode_566_ReshapeTheMatrix {

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums[0].length, column = nums.length;
        if ((row*column) != r*c) return nums;


        int[][] newNums = new int[r][c];
        int[] a = new int[r*c];
        int index = 0;

        //copy the given array into an 1D array
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                a[index] = nums[i][j];
                index++;
            }
        }

        // genarate the expected array
        index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                newNums[i][j] = a[index++];
            }
        }
        return newNums;
    }
}
