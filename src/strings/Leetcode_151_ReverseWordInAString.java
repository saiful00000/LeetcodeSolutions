package strings;

import java.util.ArrayList;

public class Leetcode_151_ReverseWordInAString {

    public static String reverseString(String s) {
        if (s == null || s.length() == 0)
            return "";
        String[] sa = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = sa.length-1; i >= 0; i--) {
            if (!sa[i].equals(""))
                sb.append(sa[i]).append(" ");
        }
        return sb.length() == 0 ? "" : sb.substring(0,sb.length()-1);
    }

    /*public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseString(s));
    }*/
}
