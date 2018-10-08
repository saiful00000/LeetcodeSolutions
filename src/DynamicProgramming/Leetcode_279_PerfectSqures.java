package DynamicProgramming;

public class Leetcode_279_PerfectSqures {

    public static int numSquares(int n) {
        int count = 0, sum = 0;
        int value = n;

        while (n > 0) {

            if (isPerfectSquare(n)) {

                while (sum + n <= value) {
                    sum += n;
                    count++;
                }

                if (sum == value)
                    return count;
            }

            n--;
        }
        return count;
    }

    static boolean isPerfectSquare(double x) {
        double sr = Math.sqrt(x);
        return ((sr - Math.floor(sr)) == 0);
    }


    public static void main(String[] args) {
        int n = 12;
        System.out.println( numSquares(n) );
    }
}
