import java.util.*;

public class TestCLass {

    /** Function to get Decimal equivalent of P **/
    public static int getDecimal(int[] B)
    {
        int p = 0;
        int t = 1;
        for (int i = 7; i >= 0; i--, t *= 2)
            p += (B[i] * t);
        if (p > 64)
            p = -(256 - p);
        return p;
    }

    /** Function to right shift array **/
    public static void rightShift(int[] A)
    {
        for (int i = 8; i >= 1; i--)
            A[i] = A[i - 1];
    }

    /** Function to add two binary arrays **/
    public static void add(int[] A, int[] B)
    {
        int carry = 0;
        for (int i = 8; i >= 0; i--)
        {
            int temp = A[i] + B[i] + carry;
            A[i] = temp % 2;
            carry = temp / 2;
        }
    }

    /** Function to get binary of a number **/
    public static int[] getBinary(int n)
    {
        int[] bin = new int[4];
        int ctr = 3;
        int num = n;
        /** for negative numbers 2 complment **/
        if (n < 0)
            num = 16 + n;
        while (num != 0)
        {
            bin[ctr--] = num % 2;
            num /= 2;
        }
        return bin;
    }

    public static void main(String[] args) {
        int mlcant = 13; int mltiplier = 11;

        int C = 0;
        int[] A = {0,0,0,0};
        int[] M = getBinary(mlcant);
        int[] Q = getBinary(mltiplier);










        /*for (int v:M)
            System.out.print(v +" ");

        System.out.println();

        for (int v : Q)
            System.out.print(v +" ");*/

    }
}



/*
* row = array[0].length
* column = array.length;
* */