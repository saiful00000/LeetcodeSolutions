package DivideAndConquer;

public class Leetcode_240_Search_a_2D_Matrix_II {

    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0)
            return false;

        int row = 0;
        int column = matrix[0].length;

        while (row < matrix.length && column >= 0) {
            if (target == matrix[row][column])
                return true;
            else if (target < matrix[row][column])
                column--;
            else
                row++;
        }

        return false;
    }
}
