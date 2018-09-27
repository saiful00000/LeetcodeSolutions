package arrays;

public class Leetcode_832_FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length / 2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][a[i].length - j - 1];
                a[i][a[i].length - j - 1] = temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 0)
                    a[i][j] = 1;
                else
                    a[i][j] = 0;
            }
        }
        return a;
    }
}
