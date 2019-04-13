package strings;

public class Leetcode_28_Implement_strSTR {

    public int strStr(String haystack, String needle) {
        int needLen = needle.length();
        if (needLen == 0) return 0;
        int hayLen = haystack.length();

        for (int i = 0; i <= hayLen-needLen; i++) {
            if (needle.charAt(0) == haystack.charAt(i)) {
                String s = haystack.substring(i, i+needLen);
                if (s.equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
