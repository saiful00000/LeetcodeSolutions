package arrays;

public class Leetcode_888_FairCandySwap {

    public static int[] fairCandySwap(int[] a, int[] b) {

        int[] resultArray = new int[2];
        int aSum = getSum(a);
        int bSum = getSum(b);
        int difference = Math.abs(aSum - bSum);

        return resultArray;

    }

    public static int getSum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] a = {1,1};
        int[] b = {2,2};


    }
}
