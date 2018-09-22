package arrays;

public class Leetcode_64_MinimumPathSum {

    public static int minPathSum(int[][] grid) {
        int colum = grid.length;
        int row = grid[0].length;

        for (int i = 0; i < colum; i++) {
            for (int j = 0; j < row; j++) {
                if (i == 0 && j != 0)
                    grid[i][j] += grid[i][j-1];
                else if (i != 0 && j == 0)
                    grid[i][j] += grid[i-1][j];
                else if(i !=0 && j!= 0)
                    grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[colum-1][row-1];
    }

    public static void main(String[] args) {
        int[][] a = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(a));

    }

}
