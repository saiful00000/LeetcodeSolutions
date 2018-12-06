package arrays;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_78_Subsets {

    public static List<List<Integer>> subSets(int[] nums) {
        int len = nums.length;
        if (len == 0) return new ArrayList<>();
        List<List<Integer>> subsets = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> set = new ArrayList<>();
            temp.add(nums[i]);
            subsets.add(temp);
            for (int j = i; j < len; j++) {
                set.add(nums[j]);
            }
            subsets.add(set);
        }
        subsets.add(new ArrayList<>());
        return subsets;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subSets(nums));
    }

}
