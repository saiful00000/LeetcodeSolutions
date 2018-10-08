import java.util.*;

public class TestCLass {
    static boolean isPerfectSquare(double x) {
        double sr = Math.sqrt(x);
        return ((sr - Math.floor(sr)) == 0);
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(4));
    }
}



/*
* row = array[0].length
* column = array.length;
* */