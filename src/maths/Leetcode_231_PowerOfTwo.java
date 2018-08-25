package maths;

public class Leetcode_231_PowerOfTwo {

    public boolean isPowerOfTwo(int n) {

        if(n == 1)
            return true;

        double d = (double) n;

        while ( d > 2.00) {
            d = d / 2.00;
        }
        if (d == 2.00)
            return true;
        else
            return false;
    }

}
