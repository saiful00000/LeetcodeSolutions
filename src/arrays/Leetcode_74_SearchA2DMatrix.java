package arrays;

public class Leetcode_74_SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix == null) {
            return false;
        }
        if (matrix[0].length == 0)
            return false;

        int row = matrix[0].length;
        int column = matrix.length;

        for (int r = 0; r < column; r++) {
            if (matrix[r][row-1] == target)
                return true;
            else if (matrix[r][row-1] < target)
                continue;
            else if (matrix[r][row-1] > target)
                return search(matrix, r, target);
        }
        return false;
    }

    public boolean search(int[][] mat, int row, int target) {
        int r = mat[0].length;
        for (int c = 0; c < r; c++) {
            if (mat[row][c] == target)
                return true;
        }
        return false;
    }
}
