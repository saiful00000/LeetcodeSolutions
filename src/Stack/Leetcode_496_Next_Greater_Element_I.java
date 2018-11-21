package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Leetcode_496_Next_Greater_Element_I {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int[] result = new int[nums1.length];
        int i = 0;

        for (int j = nums2.length-1; j >= 0; j--) {
            stack.push(nums2[j]);
        }

        for (int v:  nums1) {
            boolean flag = false;
            while (flag == false && !stack.isEmpty()) {
                int val = stack.pop();
                if (val == v) {
                    flag = true;
                }
                stack2.push(val);
            }

            if (flag == true && stack.isEmpty()) {
                result[i++] = -1;
            } else {
                boolean flag2 = false;
                while (!stack.isEmpty()) {
                    int val2 = stack.pop();
                    if (val2 > v && flag2 == false) {
                        result[i++] = val2;
                        flag2 = true;
                    }
                    stack2.push(val2);
                }
                if (flag2 == false)
                    result[i++] = -1;
            }
            while (!stack2.isEmpty()) {
                int n = stack2.pop();
                stack.push(n);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
}
