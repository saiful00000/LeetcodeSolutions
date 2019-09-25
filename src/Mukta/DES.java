package Mukta;

import java.util.Scanner;

public class DES {

    static String encryptDecrypt(String input, String key) {
        char[] in = input.toCharArray();
        char[] k = key.toCharArray();
        char[] cipherText = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            if (in[i] == k[i]) {
                cipherText[i] = '0';
            } else {
                cipherText[i] = '1';
            }
        }
        return new String(cipherText);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give your input : ");
        String inputText = input.nextLine();

        System.out.println("Give your key : ");
        String key = input.nextLine();

        String cipherText = encryptDecrypt(inputText, key);
        String outputText = encryptDecrypt(cipherText, key);

        System.out.println("The Original input is : "+ inputText);
        System.out.println("The cipher Text Is : "+ cipherText);
        System.out.println("The Output is : "+ outputText);
    }
}
