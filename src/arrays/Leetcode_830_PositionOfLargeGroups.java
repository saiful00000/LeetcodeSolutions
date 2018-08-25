package arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Leetcode_830_PositionOfLargeGroups {

    public static List<List<Integer>> largeGroupPositions(String s) {
        if(s == null || s.length() == 0)
            return new LinkedList<>();

        int n = s.length();
        int count = 1;
        int start = 0;
        List<List<Integer>> list = new LinkedList<>();

        int i;
        for (i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else if (s.charAt(i) != s.charAt(i + 1)) {
                if (count >= 3)
                    list.add(Arrays.asList(new Integer[]{start, i}));

                start = i + 1;
                count = 1;
            }
        }
        if (count >= 3)
            list.add(Arrays.asList(new Integer[]{start, i}));

        return list;
    }

    /*public static void main(String[] args) {
        String s = "abbxxxxzzy";
        System.out.println(largeGroupPositions(s));
    }*/
}
