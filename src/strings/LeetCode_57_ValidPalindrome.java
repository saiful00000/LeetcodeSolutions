package strings;

public class LeetCode_57_ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String str = "";
        for (char c: s.toCharArray()) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                str += c;
            }
        }

        str = str.toLowerCase();

        int l = 0;
        int r = str.length()-1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
