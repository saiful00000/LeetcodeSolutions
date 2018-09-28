import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestCLass {
    public static void main(String[] args) {
        int n = 5;
        int[][] a = new int[n][n];

        for (int line = 0; line < n; line++) {
            for (int j = 0; j <= line; j++) {
                if (line == 0 || j == 0)
                    a[line][j] = 1;
                else
                    a[line][j] = a[line-1][j-1] + a[line-1][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
}



/*
* row = array[0].length
* column = array.length;
* */