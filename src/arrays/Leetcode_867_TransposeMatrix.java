package arrays;

public class Leetcode_867_TransposeMatrix {
    public int[][] transpose(int[][] A) {
        int row = A.length;
        int column = A[0].length;
        int[][] a = new int[column][row];

        for(int i=0; i<column; i++){
            for(int j = 0; j<row; j++){
                a[i][j] = A[j][i];
            }
        }
        return a;
    }
}
