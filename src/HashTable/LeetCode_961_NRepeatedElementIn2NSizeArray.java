package HashTable;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_961_NRepeatedElementIn2NSizeArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,3};
        System.out.println(repeatedNTimes(array));
    }

    public static int repeatedNTimes(int[] A) {
        int n = A.length / 2;
        Map<Integer, Integer> map = new HashMap<>();

        for (int v: A) {
            if (map.containsKey(v)) {
                map.put(v, map.get(v) + 1);
            } else {
                map.put(v, 1);
            }
        }

        int i = 0;
        for (int v: map.values()) {
            if (v == n) {
                return (int) map.keySet().toArray()[i];
            }
            i++;
        }

        return 0;
    }

}
