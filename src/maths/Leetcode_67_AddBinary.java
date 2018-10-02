package maths;

public class Leetcode_67_AddBinary {
    public String addBinary(String a, String b) {
        if (a.length() == 0 || a == null) return b;
        if (b.length() == 0 || b == null) return a;

        StringBuilder result = new StringBuilder();
        int aLen = a.length()-1, bLen = b.length()-1;
        int cary = 0;

        while (aLen >= 0 || bLen >= 0) {
            int aNumber = 0;
            int bNumber = 0;

            if (aLen >= 0) {
                aNumber = a.charAt(aLen) == '0' ? 0 : 1;
                aLen--;
            }
            if (bLen >= 0) {
                bNumber = b.charAt(bLen) == '0' ? 0 : 1;
                bLen--;
            }

            int add = aNumber + bNumber + cary;
            if (add >= 2) {
                result.append(String.valueOf(add - 2));
                cary = 1;
            } else {
                result.append(String.valueOf(add));
                cary = 0;
            }
        }
        if (cary == 1)
            result.append("1");

        return result.reverse().toString();
    }
}
