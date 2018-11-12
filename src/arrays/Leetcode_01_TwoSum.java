package arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode_01_TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> map = new HashMap<>();
        int[] a = new int[2];
        map.put(nums[0], 0);

        for (int i = 1; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                a[0] = map.get(target - nums[i]);
                a[1] = i;
                break;
            }
            map.put(nums[i],i);
        }
        return a;
    }
}
