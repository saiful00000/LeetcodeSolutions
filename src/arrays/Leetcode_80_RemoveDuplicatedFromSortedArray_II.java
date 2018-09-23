package arrays;

public class Leetcode_80_RemoveDuplicatedFromSortedArray_II {

    public static int removeDuplicates(int[] nums) {

        int n = nums.length;
        int count = 1;
        int j = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i-1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    /*
    public static void main(String[] args) {
        int[] a = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(a));
    }*/
}
