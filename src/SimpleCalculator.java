import java.util.Stack;

public class SimpleCalculator {

    public static int calculator(String expression) {
        if (expression == null) return 0;

        Stack<Integer> stack = new Stack<>();
        int len = expression.length();
        int sin = 1;
        int result = 0;

        for (int i = 0; i < len; i++) {
            if (Character.isDigit(expression.charAt(i))) {
                int sum = expression.charAt(i) - '0';
                while (i + 1 < len && Character.isDigit(expression.charAt(i + 1))) {
                    sum = sum * 10 + expression.charAt(i + 1) - '0';
                    i++;
                }
                result += sum * sin;
            } else if (expression.charAt(i) == '+') {
                sin = 1;
            } else if (expression.charAt(i) == '-') {
                sin = -1;
            } else if (expression.charAt(i) == '(') {
                stack.push(result);
                stack.push(sin);
                result = 0;
                sin = 1;
            } else if (expression.charAt(i) == ')') {
                result = result * stack.pop() + stack.pop();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String expression = "";
        System.out.println(calculator(expression));
    }
}
