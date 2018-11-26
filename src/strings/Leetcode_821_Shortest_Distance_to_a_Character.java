package strings;

import java.util.Arrays;

public class Leetcode_821_Shortest_Distance_to_a_Character {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        System.out.println(Arrays.toString(shortestToChar(s,c)));
    }

    private static int[] shortestToChar(String s, char c) {
        int len = s.length();
        int[] distances = new int[len];
        int prev = Integer.MIN_VALUE / 2;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            distances[i] = i - prev;
        }
        prev = Integer.MAX_VALUE / 2;
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            distances[i] = Math.min(distances[i], prev - i);
        }
        return distances;
    }
}
