package maths;

public class Leetcode_8_StringToInteger {

    public static int myAtoi(String s) {

        String str = s.trim();
        String string = "";

        if(str.length() == 0)
            return 0;

        char[] c = str.toCharArray();

        if ( c[0] != '-' && !(c[0] >= '0' && c[0] <= '9')) {
            return 0;
        } else {
            for (char ch : c) {
                if (ch == '-' || (ch >= '0' && ch <= '9')) {
                    string += ch;
                } else {
                    break;
                }
            }
            if(string.length() == 1 && (string.charAt(0) == '-'))
                return 0;
        }
        long number = Long.parseLong(string);

        if (number < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else if(number > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else
            return (int) number;

    }

    public static void main(String[] args) {
        String s = "20000000000000000000";
        System.out.println(myAtoi(s));
        System.out.println();
    }
}
