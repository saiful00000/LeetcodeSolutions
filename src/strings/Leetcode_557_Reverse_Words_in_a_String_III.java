package strings;

import java.util.ArrayList;

public class Leetcode_557_Reverse_Words_in_a_String_III {

    public static void main(String[] args) {
        System.out.println(reverseWords("my name is saiful"));
    }

    public static String reverseWords(String s) {
        String result = "";
        String wd = "";
        ArrayList<String> words = new ArrayList<String>();

        int len = s.length(), index = 0;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != ' ') {
                char c = s.charAt(i);
                wd += c;
            }
            if (s.charAt(i) == ' ' || i == len - 1) {
                words.add(wd);
                wd = "";
            }
        }

        int x = 0;
        for (String word: words) {
            System.out.println(word);
            char[] temp = word.toCharArray();
            int start = 0;
            int end = word.length()-1;
            while (start <= end) {
                char st = temp[start];
                temp[start] = temp[end];
                temp[end] = st;
                start++; end--;
            }
            if (x == 0) {
                result += new String(temp);
                x = 1;
            } else {
                result += " " + new String(temp);
            }
        }
        return result;
    }
}
