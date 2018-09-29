package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_870_AdvantageSuffle {

    public static int[] advantageCount(int[] A, int[] B) {
        int[] newA = new int[A.length];
        Arrays.sort(A);
        boolean flag = true;

        for (int b = 0; b < B.length; b++) {
            for (int a = 0; a < A.length; a++) {
                if (B[b] < A[a]) {
                    newA[b] = A[a];
                    A[a] = -1;
                    flag = true;
                } else {
                    flag = false;
                }
            }
            if (!flag) {
                int k = 0;
                while (k != A.length) {
                    if (A[k] > 0) {
                        newA[b] = A[k];
                        A[k] = -1;
                        k = A.length;
                    }
                }
            }
        }

        return newA;
    }

    public static void main(String[] args) {
        int[] a = {12,24,8,32};
        int[] b = {13,25,32,11};
        int[] c = advantageCount(a,b);

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] +" ");
        }
    }

}
