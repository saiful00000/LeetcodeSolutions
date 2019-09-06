package DynamicProgrammingPractices;

public class FibonacciNumberSpaceOptimized {
    public static int fibo(int n) {
        int a = 0;
        int b = 1;
        int c;

        if (n == 0) {
            return a;
        }

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibo of " + n + " is = " + fibo(n));
    }
}
