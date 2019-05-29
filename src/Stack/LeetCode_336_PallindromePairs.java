package Stack;

import java.util.*;

public class LeetCode_336_PallindromePairs {


    public static List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> list = new ArrayList<>();

        int len = words.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (words[i].length() == words[j].length()) {
                    if (isPallindrome(words[i], words[j])) {
                        list.add(new ArrayList<>(Arrays.asList(i, j)));
                        list.add(new ArrayList<>(Arrays.asList(j, i)));
                    }
                } else {
                    if (isPallindrome(words[i], words[j])) {
                        list.add(new ArrayList<>(Arrays.asList(i, j)));
                    }
                    if (isPallindrome(words[j], words[i])) {
                        list.add(new ArrayList<>(Arrays.asList(j, i)));
                    }
                }
            }
        }
        return list;
    }

    public static boolean isPallindrome(String left, String right) {
        int length = left.length() + right.length();
        int jend = length - right.length();

        for (int i = 0, j = length - 1; i <= j; i++, j--) {
            char l = i >= left.length() ? right.charAt(i - left.length()) : left.charAt(i);
            char r = j < jend ? left.charAt(j) : right.charAt(j - jend);

            if (l != r) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abcd", "dcba", "lls", "s", "sssll"};
        List<List<Integer>> list = palindromePairs(words);
        System.out.println(list);
    }
}
