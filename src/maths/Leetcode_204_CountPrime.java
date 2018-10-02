package maths;

public class Leetcode_204_CountPrime {

    public static int countPrimes(int n) {
        int count = 0;

        if (n < 2) return count;
        if (n == 2) return count;

        count = 1;
        for (int i = 2; i <=n ; i++) {

            boolean flag = true;
            if (i % 2 != 0) {
                for (int j = 3; j < i / 2; j += 2) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) count++;

            } else {
                for (int j = 3; j < i/2; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) count++;
            }
        }


        return count;
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println(countPrimes(a));
    }
}
