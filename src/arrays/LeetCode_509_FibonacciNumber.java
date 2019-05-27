package arrays;

public class LeetCode_509_FibonacciNumber {

    private static int fib(int N) {
        if (N == 0 || N == 1) return N;
        int fibMinusOne = 1;
        int fibMinusTwo = 0;
        int currentFib = 0;

        for (int i = 0; i <= N; i++) {
            currentFib = fibMinusOne + fibMinusTwo;
            fibMinusTwo = fibMinusOne;
            fibMinusOne = currentFib;
        }
        return currentFib;
    }

    public static void main(String[] args) {
        System.out.println(fib(3));
    }
}
