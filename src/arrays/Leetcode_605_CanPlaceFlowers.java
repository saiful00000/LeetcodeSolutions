package arrays;

public class Leetcode_605_CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flb, int n) {
        int len  = flb.length;
        if (n == 0)
            return true;
        if (len == 1)
            return false;

        if (flb[0] == 0 && flb[1] == 0) {
            flb[0] = 1;
            n--;
        }
        if (flb[len - 1] == 0 && flb[len - 2] == 0) {
            flb[len - 1] = 1;
            n--;
        }

        int count = 0;
        for (int i = 0; i < len; i++) {
            if (flb[i] == 0)
                count++;
            if (flb[i] == 1) {
                if (count % 2 == 0)
                    count -= 1;
                if (count >= 3) {
                    n = n - (count/2);
                    count = 0;
                }
                count = 0;
            }
            if (n <= 0)
                return true;
        }

        return n == 0? true : false;
    }
}








