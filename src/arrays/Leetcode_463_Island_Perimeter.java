package arrays;

public class Leetcode_463_Island_Perimeter {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length, column = grid[0].length;
        int land = 0;
        int island = 0;
        for(int r = 0; r < row; r++){
            for(int c = 0; c < column; c++){
                if(grid[r][c] == 1){
                    land++;
                    if(r+1 >= 0 && r+1 < row && grid[r+1][c] == 1)
                        island++;
                    if(c+1 >= 0 && c+1 < column && grid[r][c+1] == 1)
                        island++;
                }
            }
        }
        return land * 4 - island * 2;
    }
}
