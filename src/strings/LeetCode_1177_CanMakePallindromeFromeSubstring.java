/*
package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode_1177_CanMakePallindromeFromeSubstring {

    static public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        List<Boolean> list = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            list.add(isPossible(s, queries[i][0], queries[i][1], queries[i][2]));
        }

        return list;
    }

    static public boolean isPossible(String s, int start, int end, int kk) {

        HashMap<Character, Integer> frequencys = new HashMap<>();

        // gett all character frequencies
        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            if (frequencys.containsKey(c)) {
                frequencys.put(c, frequencys.get(c) + 1);
            } else {
                frequencys.put(c, 1);
            }
        }

        int len = Math.abs(start - end)+1;
        boolean check = true;

        int count = 0;

        for (:) {

        }

        return false;
    }

    public static void main(String[] args) {
        String s = "abcda";
        int[][] q = {{3,3,0},{1,2,0},{0,3,1},{0,3,2},{0,4,1}};
        System.out.println(canMakePaliQueries(s,q));
    }
}
*/
