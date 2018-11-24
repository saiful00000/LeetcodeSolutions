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
        int juels = 0;
        for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (J.charAt(i) == S.charAt(j)) {
                    juels++;
                }
            }
        }
        return juels;
    }
}
