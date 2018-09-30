package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_34_CombinationSum {

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();

        for (int v : nums) map.put(v,v);

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int dif = target - value;
            if (value == target) {
                list.add(value);
                finalList.add(list);
                list.clear();
                continue;
            }
            int sum = value;
            if (sum < target) {
                while (sum < target) {
                    if (map.containsKey(dif)) {
                        list.add(value);
                        list.add(map.get(dif));
                        finalList.add(list);
                        list.remove(list.size()-1);
                    }
                    sum += value;

                }
            }


        }

        return finalList;
    }
}
