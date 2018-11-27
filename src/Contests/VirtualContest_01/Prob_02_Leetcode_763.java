package Contests.VirtualContest_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prob_02_Leetcode_763 {

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s));
    }

    public static List<Integer> partitionLabels(String s) {

        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), i);
        int i = 0;
        while (i < s.length()) {
            int count = 1;
            int current = map.get(s.charAt(i));
            while (i < current) {
                current = Math.max(current,map.get(s.charAt(i)));
                i++;
                count++;
            }
            i++;
            result.add(count);
        }
        return result;
    }
}
