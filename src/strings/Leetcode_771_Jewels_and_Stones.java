package strings;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_771_Jewels_and_Stones {

    public static void main(String[] args) {
        String j = "aA";
        String s = "aAAbbbb";
        System.out.println(numJewelsInStones(j,s));
    }

    public static int numJewelsInStones(String J, String S) {
        Map<Character,Integer> map = new HashMap<>();
        int juels = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c,1);
            }
        }
        for (int i = 0; i < J.length(); i++) {
            char c = J.charAt(i);
            if (map.containsKey(c)) {
                juels += map.get(c);
            }
        }
        return juels;
    }
}
