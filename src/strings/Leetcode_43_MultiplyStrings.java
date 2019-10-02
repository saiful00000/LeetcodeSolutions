package strings;

public class Leetcode_43_MultiplyStrings {

    static public String multiply(String num1, String num2) {
        if (num1.charAt(0) == '0' || num2.charAt(0) == '0')
            return "0";

        int len1 = num1.length(), len2 = num2.length();
        int multyply[] = new int[num1.length()+num2.length()];
        String s = new String();

        for (int i = len1-1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int temp = multyply[i+j+1] + (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                multyply[i+j] = multyply[i+j] + temp / 10;
                multyply[i+j+1] = temp % 10;
            }
        }
        // get first nonezero index
        int index = 0;
        while (multyply[index] == 0) {
            index++;
        }

        for (int i = index; i < multyply.length; i++) {
            s += multyply[i];
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(multiply("9", "9"));
    }
}
