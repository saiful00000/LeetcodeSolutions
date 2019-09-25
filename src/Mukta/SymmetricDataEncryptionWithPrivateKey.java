package Mukta;

import java.util.Scanner;

public class SymmetricDataEncryptionWithPrivateKey {

    static String encryptionDecryption(String s, int block, int[] key) {
        char[] array = s.toCharArray();
        int len = array.length;
        char[] encrypted = new char[len];

        for (int i = 0; i < len; i+=block) {
            int keyIndex = 0;
            for (int j = i; j < i+block; j++) {
                encrypted[j] = array[key[keyIndex]+i-1];
                keyIndex++;
            }
        }
        return new String(encrypted);
    }

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
        Scanner input = new Scanner(System.in);

        System.out.println("Enter input text : ");
        String inputText = input.nextLine();

        System.out.println("Enter block size : ");
        int block = input.nextInt();

        System.out.println("The original Text is : "+ inputText);

        String cipherText = cipher(inputText);
        System.out.println("The cipher text is   : "+ cipherText);

        int[] parmulation = {4, 1, 2, 5, 3};
        String parmulatedCipherText = encryptionDecryption(cipherText, block, parmulation);
        System.out.println("ParmulatedCipher text is : "+ parmulatedCipherText);

        int[] inverseParmulation = {2, 3, 5, 1, 4};
        String inverseParmulatedCipherText = encryptionDecryption(parmulatedCipherText, block, inverseParmulation);
        System.out.println("Inverse parmulated cipher text is : " + inverseParmulatedCipherText);

        String output = inverseCipher(inverseParmulatedCipherText);
        System.out.println("Inverse chipher text and output : "+ output);

    }

}
