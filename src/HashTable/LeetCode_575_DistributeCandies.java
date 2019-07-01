package HashTable;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_575_DistributeCandies {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 3};
        System.out.println(distributeCandies(array));
    }

    public static int distributeCandies(int[] candies) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : candies) {
            if (map.containsKey(value)) {
                int v = map.get(value) + 1;
                map.put(value, v);
            } else {
                map.put(value, 1);
            }
        }

        int arrLen = candies.length;
        int mapLen = map.size();

        return (mapLen <= arrLen/2) ? mapLen : arrLen/2;
    }

}
