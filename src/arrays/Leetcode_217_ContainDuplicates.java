package arrays;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_217_ContainDuplicates {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> integers = new HashSet<>();
        for (int value:nums) {
            integers.add(value);
        }
        if (nums.length == integers.size())
            return false;
        else
            return true;
    }
}
