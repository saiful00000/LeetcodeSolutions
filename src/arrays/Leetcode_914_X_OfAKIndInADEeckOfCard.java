package arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Leetcode_914_X_OfAKIndInADEeckOfCard {

    public static boolean hasGroupsSizeX(int[] deck) {

        int n = deck.length;
        if (n < 2) return false;

        Map<Integer,Integer> map = new HashMap<>();
        // put all the frequency for all map value into a map
        for (int i = 0; i < n; i++) {
            map.put(deck[i], map.getOrDefault(deck[i],0)+1);
        }

        // get map min value
        int min = 10001;
        for (int v : map.values()) min = Math.min(min,v);

        if (min < 2) return false;

        for (int value : map.values()) {

            boolean flag = false;

            for (int i = 2; i <= min; i++) {
                if (value % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                return false;

        }
        return true;
    }
}
