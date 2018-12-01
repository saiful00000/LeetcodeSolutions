package strings;

public class Leetcode_657_Robot_Return_To_The_Origin {
    public static boolean judgeCircle(String moves) {
        int left = 0, right = 0;
        int up = 0, down = 0;

        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if (c == 'U') {
                up++;
            } else if (c == 'D') {
                down++;
            } else if (c == 'L') {
                left++;
            } else if (c == 'R') {
                right++;
            }
        }
        return (left == right) && (up == down);
    }

    public static void main(String[] args) {
        String s = "UDL";
        System.out.println(judgeCircle(s));
    }
}
