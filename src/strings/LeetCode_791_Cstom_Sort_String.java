package strings;

public class LeetCode_791_Cstom_Sort_String {

    public static void main(String[] args) {
        String S = "cba";
        String T = "abcd";
        System.out.println(customSortString(S,T));
    }

    static public String customSortString(String S, String T) {
        char[] t = T.toCharArray();
        int sLen = S.length()-1;
        int tLen = T.length();
        while (sLen >= 0) {
            char c = S.charAt(sLen);
            for (int index = 0; index < tLen; index++) {
                if (t[index] == c) {
                    char temp = t[index];
                    for (int j = index-1; j >= 0; j--) {
                        t[j+1] = t[j];
                    }
                    t[0] = temp;
                }
            }
            sLen--;
        }
        return String.valueOf(t);
    }
}
