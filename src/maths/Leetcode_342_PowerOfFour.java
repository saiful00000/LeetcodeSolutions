package maths;

public class Leetcode_342_PowerOfFour {

    public static boolean isPowerOfFour(int n) {
        if(n == 1)
            return true;

        double d = (double) n;
        while ( d > 4.00) {
            d = d / 4.00;
        }
        if (d == 4.00)
            return true;
        else
            return false;
    }

}
