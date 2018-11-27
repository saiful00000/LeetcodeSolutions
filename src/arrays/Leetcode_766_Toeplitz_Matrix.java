package arrays;

public class Leetcode_766_Toeplitz_Matrix {
    public boolean isToeplitzMatrix(int[][] array) {
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[0].length; c++) {
                if (r > 0 && c > 0 && array[r-1][c-1] != array[r][c])
                    return false;
            }
        }
        return true;
    }
}
