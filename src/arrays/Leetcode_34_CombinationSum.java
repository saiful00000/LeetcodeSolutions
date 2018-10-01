package arrays;

import java.lang.reflect.Array;
import java.util.*;

public class Leetcode_34_CombinationSum {

    public static List<List<Integer>> combinationSum(int[] nums, int target) {
       List<List<Integer>> finalList = new ArrayList<>();
        Arrays.sort(nums);

        search(finalList,new ArrayList<>(),nums,target,0);

        return finalList;
    }

    public static void search(List<List<Integer>> finalList, List<Integer> list, int[] nums, int target, int index) {
        if (target < 0)
            return;
        if (target == 0) {
            finalList.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            search(finalList,list,nums,target - nums[i],i);
            list.remove(list.size()-1);

            if (target - nums[i] < 0)
                break;
        }
    }
}
