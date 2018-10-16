package DynamicProgramming;

public class Leetcode_357_COuntNumbersWithUniqueDigits {

    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;

        int range = 10;
        int count = 0;

        for (int i = 1; i < n; i++)
            range *= 10;

        for (int i = 0; i <= range; i++) {
            if (isUnique(i))
                count++;
        }

        return count;
    }

    public static boolean isUnique(int n) {
        boolean[] unique = new boolean[10];

        while (n != 0) {
            if (unique[n%10])
                break;

            unique[n%10] = true;
            n /= 10;
        }

        return n == 0 ? true : false;
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println( countNumbersWithUniqueDigits(n) );
    }
}
