package arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode_01_TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> map = new HashMap<>();
        int[] a = new int[2];
        map.put(nums[0], 0);

        for (int i = 1; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                a[0] = map.get(comp);
                a[1] = i;
                break;
            }
            map.put(nums[i],i);
        }
        return a;
    }
}
