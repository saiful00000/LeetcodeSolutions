package arrays;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_136_SingleNumber {

    public static int singleNumbr(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int updateCValue = map.get(nums[i]);
                map.put(nums[i], updateCValue + 1);
            } else {
                map.put(nums[i] , 1);
            }
        }
        int key = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1){
                key = entry.getKey();
                break;
            }
        }
        return key;
    }

}
