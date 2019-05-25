package arrays;

public class LeetCode_1035_UncrossedLines {

    public static void main(String[] args) {
        int[] B = {1,3,7,1,7,5};
        int[] A = {1,9,2,5,1};
        int maximumLines = maxUncrossedLines(A,B);
        System.out.println(maximumLines);
    }


    public static int maxUncrossedLines(int[] A, int[] B) {
        int aLen = A.length;
        int bLen = B.length;
        int[][] lookup = new int[aLen+1][bLen+1];

        for (int i = 1; i <= aLen; i++) {
            for (int j = 1; j <= bLen; j++) {
                if (A[i-1] == B[j-1]) {
                    lookup[i][j] = lookup[i - 1][j - 1] + 1;
                } else {
                    lookup[i][j] = Math.max(lookup[i-1][j], lookup[i][j-1]);
                }
            }
        }
        return lookup[aLen][bLen];
    }

}
