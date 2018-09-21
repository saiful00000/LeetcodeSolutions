package arrays;

public class Leetcode_905_SortArrayByParity {

    public static int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length-1;

        while (i <= j) {
            if (!isEven(A[i]) && isEven(A[j])) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;

                i++;
                j--;
            } else if (isEven(A[i])) {
                i++;
            } else if (!isEven(A[j])) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return A;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0 ? true : false;
    }
}
