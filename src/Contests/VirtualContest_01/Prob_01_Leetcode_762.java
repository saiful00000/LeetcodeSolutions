package Contests.VirtualContest_01;

public class Prob_01_Leetcode_762 {
    public static int countPrimeSetBits(int L, int R) {
        int count = 0;

        for (int i = L; i <= R; i++) {
            int setBits = Integer.bitCount(i);
            if (isPrime(setBits))
                count++;
        }
        return count;
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int l = 6;
        int r = 10;
        System.out.println(countPrimeSetBits(l,r));
    }
}
