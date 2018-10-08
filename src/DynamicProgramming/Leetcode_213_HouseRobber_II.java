package DynamicProgramming;

public class Leetcode_213_HouseRobber_II {

    private int rob(int[] money, int l, int h) {
        int n = money.length;

        if (n == 1) return money[0];

        int in = 0, ex = 0;

        for (int j = l; j <= h; j++) {
            int i = in, e = ex;;
            in = e + money[j];
            ex = Math.max(i,e);
        }
        return Math.max(in,ex);
    }

    public int rob(int[] money) {
        if (money.length == 1) return money[0];

        int n = money.length;
        return Math.max(rob(money, 0, n-2) , rob(money, 1, n-1));

    }
}
