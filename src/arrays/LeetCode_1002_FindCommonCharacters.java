package arrays;

import java.util.*;

public class LeetCode_1002_FindCommonCharacters {


    static List<char[]> strings = new ArrayList<>();
    public static List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();

        for (String s: A) {
            char[] cars = s.toCharArray();
            strings.add(cars);
        }

        String str = A[0];
        for (int i = 0; i < str.length(); i++) {
            int count = contains(str.charAt(i));
            if (count == A.length - 1){
                list.add(Character.toString(str.charAt(i)));
            }
        }
        return list;
    }

    public static int contains(char c) {
        int count = 0;
        int len = strings.size();
        for (int i = 1; i < len; i++) {
            int len2 = strings.get(i).length;
            for (int j = 0; j < len2; j++) {
                if (strings.get(i)[j] == c) {
                    count++;
                    strings.get(i)[j] = '0';
                    break;
                } else {
                    continue;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] s = {"cool","lock","cook"};
        List<String> list = commonChars(s);
        System.out.println(list);
    }
}
