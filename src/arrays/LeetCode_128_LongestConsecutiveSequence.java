package arrays;

import java.util.Arrays;

public class LeetCode_128_LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        if (nums.length == 0)
            return 0;

        int currentStrk = 1;
        int longestStrk = 1;

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                if (nums[i] == nums[i-1] + 1) {
                    currentStrk += 1;
                } else {
                    longestStrk = Math.max(longestStrk, currentStrk);
                    currentStrk = 1;
                }
            }
        }

        return currentStrk > longestStrk ? currentStrk : longestStrk;
    }

    public static void main(String[] args) {

        LeetCode_128_LongestConsecutiveSequence ob = new LeetCode_128_LongestConsecutiveSequence();

        int[] array = {1,2,3,4,202,5,6,7,8,9, 120, 10, 11, 12};
        System.out.println(ob.longestConsecutive(array));
    }

}
