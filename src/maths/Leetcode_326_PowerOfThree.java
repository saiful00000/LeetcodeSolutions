package maths;

public class Leetcode_326_PowerOfThree {

    public static boolean isPowerOfThree(int n) {
        if(n == 1)
            return true;

        double d = (double) n;
        while ( d > 3.00) {
            d = d / 3.00;
        }
        if (d == 3.00)
            return true;
        else
            return false;
    }

    /*public static void main(String[] args) {
        int n = 9;
        System.out.println(isPowerOfThree(n));
    }*/

}
