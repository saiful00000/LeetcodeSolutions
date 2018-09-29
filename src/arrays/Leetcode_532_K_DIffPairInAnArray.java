package arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode_532_K_DIffPairInAnArray {

    public static int findPairs(int[] nums, int k) {
        if(k < 0) return 0;

        Set<Integer> set = new HashSet<>();
        Set<Integer> count = new HashSet<>();

        for (int v: nums) {
            if (set.contains(v+k)) count.add(v+k);
            if (set.contains(v-k)) count.add(v-k);
            set.add(v);
        }
        return count.size();
    }
}
