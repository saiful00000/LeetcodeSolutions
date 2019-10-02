package strings;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_03_LongestSUbstringWithoutRepeatingCharacters {

    static public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLen = 0, i = 0, j = 0;

        while (i < s.length() && j < s.length()) {
            if (!set.contains(s.charAt(j)))  {
                set.add(s.charAt(j++));
                maxLen = Math.max(maxLen, (j - i));
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
