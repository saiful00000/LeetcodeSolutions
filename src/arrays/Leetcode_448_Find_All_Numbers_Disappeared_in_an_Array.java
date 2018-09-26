package arrays;
import java.util.*;
import java.util.List;

public class Leetcode_448_Find_All_Numbers_Disappeared_in_an_Array {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int abs = Math.abs(nums[i])-1;
            if (nums[abs] > 0) {
                nums[abs] = -nums[abs];
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                list.add(i+1);
            }
        }
        return list;
    }
}
