package arrays;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_219_ContainsDuplicate_II {
    public static boolean containsNumberByDuplicate(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k)
                    return true;
            map.put(nums[i],i);
        }
        return false;
    }
}
