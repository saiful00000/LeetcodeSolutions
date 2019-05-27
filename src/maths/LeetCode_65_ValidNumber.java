package maths;

public class LeetCode_65_ValidNumber {

    public static boolean isNumber(String str) {
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                continue;
            switch (str.charAt(i)) {
                case 'e':
                case '+':
                case '-':
                case '.':
                    break;
                default:
                    return false;
            }
        }
        try {
            Double d = Double.parseDouble(str);
            return true;
        } catch (Exception e) {

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isNumber(" 6e-1"));
    }

}
