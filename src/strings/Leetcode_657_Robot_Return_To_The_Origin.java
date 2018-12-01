package strings;

public class Leetcode_657_Robot_Return_To_The_Origin {
    public static boolean judgeCircle(String moves) {
        int left = 0, right = 0;
        int up = 0, down = 0;

        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if (c == 'U') {
                if (down == 0)
                    up++;
                else
                    down--;
            } else if (c == 'D') {
                if (up == 0)
                    down++;
                else
                    up--;
            } else if (c == 'L') {
                if (right == 0)
                    left++;
                else
                    right--;
            } else if (c == 'R') {
                if (left == 0)
                    right++;
                else
                    left--;
            }
        }
        return (left == 0 && right == 0 && up == 0 && down == 0);
    }

    public static void main(String[] args) {
        String s = "UDL";
        System.out.println(judgeCircle(s));
    }
}
