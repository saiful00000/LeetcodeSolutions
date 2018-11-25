package strings;

public class Leetcode_344_Reverse_String {

    public static void main(String[] args) {
        String str = "saiful islam .";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        if (str == null || str.length() == 1)
            return str;
        int start = 0, end = str.length()-1;
        char[] s = str.toCharArray();
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        return new String(s);
    }
}
