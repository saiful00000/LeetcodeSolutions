package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Leetcode_739_Daily_Temperatures {

    public static int[] dailyTemperatures(int[] tempa) {
        int[] result = new int[tempa.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = tempa.length - 1; i >= 0; i--) {
            stack.push(tempa[i]);
        }

        for (int i = 1; i <= tempa.length - 1; i++) {
            int current = stack.pop();
            int count = 1;
            int j = i;
            while (current > tempa[j] && j < tempa.length-1) {
                j++;
                count++;
            }

            if (j == tempa.length-1 && current > tempa[tempa.length-1])
                result[i-1] = 0;
            else if (j <= tempa.length-1)
                result[i-1] = count;
            else
                result[i-1] = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] tempa = {55,38,53,81,61,93,97,32,43,78};
        System.out.println(Arrays.toString(dailyTemperatures(tempa)));
    }
}
