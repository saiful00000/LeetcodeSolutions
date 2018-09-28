package arrays;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_119_PascalsTriangle_II {

    public List<Integer> getRow(int n) {
        List<Integer> list = new ArrayList<>();
        long number = 1;

        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == n)
                list.add(1);
            else
                list.add((int)(number = (n - i+1) * number/i));
        }
        return list;
    }
}
