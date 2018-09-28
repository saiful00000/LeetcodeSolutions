package arrays;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_118_PascalsTriangle {

    public static List<List<Integer>> generate(int n) {
        int[][] a = new int[n][n];
        List<List<Integer>> fList = new ArrayList<>();

        for (int line = 0; line < n; line++) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i <= line; i++) {
                if (line == 0 || i == 0)
                    a[line][i] = 1;
                else
                    a[line][i] = a[line-1][i-1] + a[line-1][i];

                list.add(a[line][i]);
            }
            fList.add(list);
        }
        return fList;
    }

}
