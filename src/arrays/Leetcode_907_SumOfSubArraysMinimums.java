package arrays;

public class Leetcode_907_SumOfSubArraysMinimums {

    public static int printAllSubArray(int[] a) {

        int minSum = 0;

        for (int i = 0; i < a.length; i++) {
            int minValue = a[i];
            for (int j = i; j < a.length; j++) {

                for (int k = i; k <= j; k++) {
                    minValue = Math.min(a[k], minValue);
                }
                minSum += minValue;
            }
        }
        return minSum;
    }

    public static void main(String[] args) {
        int[] a = {3,1,2,4};
        System.out.println(printAllSubArray(a));
    }
}
