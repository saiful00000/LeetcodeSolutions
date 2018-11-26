package strings;

import java.util.Arrays;

public class Leetcode_821_Shortest_Distance_to_a_Character {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        System.out.println(Arrays.toString(shortestToChar(s,c)));
    }

    public static int[] shortestToChar(String s, char c) {
        int len = s.length();
        int lastOcurence = s.lastIndexOf(c);
        int[] distances = new int[len];

        for (int i = lastOcurence; i < len; i++)
            distances[i] = 0;

        for (int i = 0; i < lastOcurence; i++) {
            if (s.charAt(i) == c) {
                distances[i] = 0;
                continue;
            }
            int count = 1;
            for (int j = i; s.charAt(j+1) != c; j++) {
                count++;
            }
            distances[i] = count;
        }
        return distances;
    }
}
