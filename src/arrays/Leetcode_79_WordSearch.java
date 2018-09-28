package arrays;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_79_WordSearch {

    public static boolean exist(char[][] board, String word) {
        Map <Character,Integer> map = new HashMap<>();
        map.put(board[0][0],0);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (map.containsKey(board[i][j])) {
                    int temp = map.get(board[i][j]);
                    map.put(board[i][j], temp + 1);
                } else {
                    map.put(board[i][j],1);
                }
            }
        }

        char[] c = word.toCharArray();
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (map.containsKey(c[i]) && map.get(c[i]) != 0) {
                int temp = map.get(c[i]);
                map.put(c[i],temp-1);

                count++;
            } else {
                return false;
            }
        }
        return count == c.length ? true : false;
    }

    public static void main(String[] args) {
        char[][] a = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "AAA";
        System.out.println(exist(a,word));

    }
}
