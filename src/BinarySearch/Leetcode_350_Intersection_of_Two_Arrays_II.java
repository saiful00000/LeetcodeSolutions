package BinarySearch;


import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode_350_Intersection_of_Two_Arrays_II {

    public static int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int first = 0, aLen = nums1.length;
        int second = 0, bLen = nums2.length;

        while (first < aLen && second < bLen) {

            if (nums1[first] == nums2[second]) {
                list.add(nums1[first]);
                first++;
                second++;
            } else if (nums1[first] < nums2[second]) {
                first++;
            } else if (nums1[first] > nums2[second]) {
                second++;
            }
        }

        int i = 0;
        int[] result = new int[list.size()];
        for (int v : list) {
            result[i++] = v;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2};
        int[] b = {2, 2};

        System.out.println(Arrays.toString(intersect(a,b)));


    }

}
