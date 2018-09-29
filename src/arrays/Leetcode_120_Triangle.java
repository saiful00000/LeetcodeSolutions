package arrays;

import java.util.List;

public class Leetcode_120_Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int sum = triangle.get(0).get(0);
        int check = 0;

        for (int i = 1; i < n; i++) {
            List<Integer> list = triangle.get(i);
            int left = check, right = check + 1;
            int leftValue =list.get(left);
            int rightValue = list.get(right);

            sum += Math.min(leftValue, rightValue);

            check = leftValue <= rightValue ? leftValue : rightValue;
        }

        return sum;
    }

}
