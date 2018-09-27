package arrays;

public class Leetcode_724_FindPivotIndex {

    public int findPivot(int[] nums){
        if (nums.length < 3)
            return -1;

        int sum = 0, leftSum = 0;
        for (int value:nums)
            sum += value;

        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if (leftSum == sum)
                return i;

            leftSum += nums[i];
        }

        return -1;
    }

}









