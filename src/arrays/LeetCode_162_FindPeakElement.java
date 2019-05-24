package arrays;

public class LeetCode_162_FindPeakElement {

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        int len = nums.length;
        if (len == 1) return 0;
        int left = 1;
        int right = len - 2;

        while (left <= right) {
            if (nums[left - 1] < nums[left] && nums[left + 1] < nums[left]) {
                return left;
            }
            if (nums[right - 1] < nums[right] && nums[right + 1] < nums[right]) {
                return right;
            }
            left++;
            right--;
        }

        if (nums[0] > nums[1]) {
            return 0;
        } else if (nums[len - 1] > nums[len - 2]) {
            return len-1;
        }

        return 0;
    }
}
