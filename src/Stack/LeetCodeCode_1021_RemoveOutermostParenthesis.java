package Stack;

public class LeetCodeCode_1021_RemoveOutermostParenthesis {

    public static String removeOuterParentheses(String S) {

        StringBuilder result = new StringBuilder();
        int i = 0;

        for (char c : S.toCharArray()) {
            if (i == 0) {
                i++;
            } else {
                if (c == '(') {
                    i++;
                } else {
                    i--;
                }

                if (i != 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(()()())"));
    }
}
