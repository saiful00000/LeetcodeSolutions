package strings;

public class Leetcode_171_ExcelSheetColumnNumber {

    public static void main(String[] args) {
        String str = "ZY";
        System.out.println(gettitleNumber(str));
    }

    private static int gettitleNumber(String str) {
        int len = str.length();
        int titleNumber = 0;

        for (int i = 0; i < len; i++) {
            titleNumber *= 26;
            titleNumber += str.charAt(i) - 'A' + 1;
        }
        return titleNumber;
    }

}
