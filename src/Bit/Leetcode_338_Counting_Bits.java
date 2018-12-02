package Bit;

import java.util.Arrays;

public class Leetcode_338_Counting_Bits {
    public static int[] countBits(int num) {
        int[] bits = new int[num+1];
        for (int i = 0; i <= num; i++) {
            bits[i] = getSetBits(i);
        }
        return bits;
    }

    public static int getSetBits(int number) {
        int count = 0;
        while (number > 0) {
            count += number & 1;
            number >>= 1;
        }
        return count;
    }


    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(countBits(n)));
    }
}
