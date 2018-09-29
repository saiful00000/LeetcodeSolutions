package arrays;

import java.util.Arrays;

public class Leetcode_04_MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newA = new int[nums1.length + nums2.length];
        int n = newA.length-1;
        double result = 0;

        int i;
        for(i = 0; i < nums1.length; i++){
            newA[i] = nums1[i];
        }
        for(int j = 0; j < nums2.length; j++){
            newA[i++] = nums2[j];
        }

        Arrays.sort(newA);

        if (n % 2 == 0) {
            result = (double) newA[n / 2];
        } else {
            int a = newA[n / 2] + newA[n / 2 + 1];
            result = (double) a / 2;
        }
        return result;
    }
}
