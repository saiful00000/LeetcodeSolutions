package arrays;

public class Leetcode_84_largestRactancleInHistogram {

    public int largestRectangleArea(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int sum = 0;
        int count = 1;

        for (int i = 0; i < nums.length; i++) {


            int value = nums[i];
            for (int j = i; j < right; j++) {
                if (nums[j+1] >= value)
                    count++;
                else
                    break;
            }
            for (int j = i; j > left; j--) {
                if (nums[j-1] >= value)
                    count++;
                else
                    break;
            }

            sum = Math.max(sum, (value * count));
            count = 1;

        }
        return sum;
    }
}
