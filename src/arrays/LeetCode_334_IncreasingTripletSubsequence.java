package arrays;

public class LeetCode_334_IncreasingTripletSubsequence {

    public static void main(String[] args) {

    }

    public static boolean increasingTriplet(int[] nums) {

        int len = nums.length;
        if (len <= 2)
            return false;

        int first = nums[0];
        int secod = first;
        int third = secod;

        int i = 0;
        /*while (i < len - 1) {
            while (i < len - 1 && first > nums[i+1])
                i++;
            first = nums[i];
            secod = first;
            while (i < len - 1 && (nums[i+] == first ||   )
        }*/

        return true;
    }

}
