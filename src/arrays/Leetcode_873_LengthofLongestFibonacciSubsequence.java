package arrays;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_873_LengthofLongestFibonacciSubsequence {

    public static int lenLongestFibSubseq(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int value:nums) set.add(value);

        int n = nums.length;

        int ans = 0;
        for (int i = 0; i < n; ++i)
            for (int j = i+1; j < n; ++j) {
                int currentMax = nums[j];
                int currentFib = nums[i] + nums[j];
                int length = 2;

                while (set.contains(currentFib)) {
                    int tempo = currentFib;
                    currentFib += currentMax;
                    currentMax = tempo;
                    ans = Math.max(ans, ++length);
                }
            }
        return ans >= 3 ? ans : 0;
    }
    /*public static void main(String[] args) {
        int[] a = {1,3,7,11,12,14,18};
        System.out.println(lenLongestFibSubseq(a));
    }*/
}
