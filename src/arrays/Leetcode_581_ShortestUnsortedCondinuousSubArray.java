package arrays;

public class Leetcode_581_ShortestUnsortedCondinuousSubArray {

    public static int findUnsortedSubarray(int[] nums) {
        if (nums.length == 1 )
            return 1;

        int start = 0;
        int end = nums.length-1;
        int endPoint = end;
        int startPoint = start;

        while (nums[end] >= nums[end - 1] && end > 0) {
            if (end == 1)
                return 0;
            end--;
        }
        while (nums[start] < nums[start + 1]) {
            if (start == nums.length-1)
                return 1;
            start++;
        }

        return (startPoint-1) + endPoint;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(findUnsortedSubarray(a));
    }

}
