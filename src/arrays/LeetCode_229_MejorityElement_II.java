package arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_229_MejorityElement_II {
     static public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int len = nums.length;

         if (len == 0) {
             return new ArrayList<>();
         } else if (len == 1) {
             list.add(nums[0]);
             return list;
         }

        Arrays.sort(nums);

        int rng = (len) / 3;
        int count = 1;
        int ii = 0;
        for (int i = 0; i < len-1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                if (count > rng) {
                    list.add(nums[i]);
                }
                count = 1;
            }
            ii++;
        }
         if (count > rng) {
             list.add(nums[ii]);
         }
        return list;
    }

    public static void main(String[] args) {
        int[] a = {1,2};
        System.out.println(majorityElement(a));
    }


}
