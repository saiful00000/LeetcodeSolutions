package arrays;

public class Leetcode_283_MoveZeroes {

    public void moveZeroes(int[] nums) {
        int count = 0;
        int n = nums.length;
        int j = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == 0)
                count++;
            else{
                nums[j] = nums[i];
                j++;
            }
        }
        for(int i = n-count; i < n; i++){
            nums[i] = 0;
        }
    }

}
