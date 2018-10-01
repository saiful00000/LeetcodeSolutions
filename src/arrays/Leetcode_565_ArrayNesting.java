package arrays;

public class Leetcode_565_ArrayNesting {

    public static int arrayNesting(int[] nums) {
        int n = nums.length;
        int s, count, temp, maxCount = 0;

        for (int i = 0; i < n; i++) {
            s = i;
            temp = nums[i];
            count = 1;
            while (temp != s) {
                temp = nums[temp];
                count++;
            }
            if (maxCount < count)
                maxCount = count;
        }
        return maxCount;
    }
}
