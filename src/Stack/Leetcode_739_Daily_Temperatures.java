package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Leetcode_739_Daily_Temperatures {

    public static int[] dailyTemperatures(int[] tempa) {
        int[] result = new int[tempa.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = tempa.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && tempa[i] >= tempa[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty())
                result[i] = 0;
            else
                result[i] = stack.peek() - i;

            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] tempa = {55,38,53,81,61,93,97,32,43,78};
        System.out.println(Arrays.toString(dailyTemperatures(tempa)));
    }
}
