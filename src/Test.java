import java.util.*;

public class Test {

    public static void main(String[] args) {
        int input = 5;
        String s = Integer.toBinaryString(input);
        char[] ch = s.toCharArray();
        s = "";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '0') {
                s += '1';
            } else {
                s += '0';
            }
        }
        System.out.println(s);
        int number = Integer.parseInt(s, 2);
        System.out.println(number);
    }
}


