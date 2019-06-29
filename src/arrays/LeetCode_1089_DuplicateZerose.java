package arrays;

import java.util.Arrays;

public class LeetCode_1089_DuplicateZerose {

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
                   //1,0,0,2,3,0,0,4
        duplicateZeros(arr);

    }

    public static void duplicateZeros(int[] arr) {
        int len = arr.length-1;
        for (int i = 0; i <= len; i++) {
            if (arr[i] == 0) {
                int temp = len-1;
                while (temp >= i) {
                    arr[temp + 1] = arr[temp];
                    temp--;
                }
                i++;
            }
        }
    }

}
