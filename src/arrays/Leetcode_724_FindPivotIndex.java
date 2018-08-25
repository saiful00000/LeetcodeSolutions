package arrays;

public class Leetcode_724_FindPivotIndex {

    public int findPivot(int[] nums){
        if(nums.length == 0){
            return -1;
        }

        int sumLeft = nums[0];
        int sumRight = 0;
        int left = 0, right = nums.length ;
        while( left<=right  ){
            if(sumLeft > sumRight){
                sumRight += nums[--right];
            }else if(sumLeft < sumRight){
                sumLeft += nums[++left];
            }else{
                if(left+1 == right-1){
                    return left+1;
                }

                if(nums[right-1] == 0){
                    right--;
                }else if(nums[left+1] == 0){
                    left++;
                }else {
                    sumRight += nums[right--];
                    sumLeft += nums[left++];
                }
            }
        }
        return -1;
    }

}
