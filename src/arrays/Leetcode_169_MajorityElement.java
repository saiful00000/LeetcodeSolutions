package arrays;

public class Leetcode_169_MajorityElement {

    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count++;
                majorityElement = nums[i];
            } else if (majorityElement == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return majorityElement;
    }
}
