import java.util.*;



public class Test {

    public static String cipher(String s) {
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char temp = array[i];
            if (temp == 'W' || temp == 'X' || temp == 'Y' || temp == 'Z') {
                array[i] = (char) (temp - 22);
            } else {
                array[i] = (char) (temp + 4);
            }
        }
        return new String(array);
    }

    public static String inverseCipher(String s) {
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char temp = array[i];
            if (temp == 'A' || temp == 'B' || temp == 'C' || temp == 'D') {
                array[i] = (char) (temp + 22);
            } else {
                array[i] = (char) (temp - 4);
            }
        }
        return new String(array);
    }

    public static void main(String[] args) {
        String man = "W";
        String cipr = cipher(man);
        String backMain = inverseCipher(cipr);

        System.out.println("Inputed : "+ man);
        System.out.println("Chipher : "+ cipr);
        System.out.println("Back main : "+ backMain);
    }


}


