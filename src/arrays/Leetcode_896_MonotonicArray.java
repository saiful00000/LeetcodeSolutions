package arrays;

public class Leetcode_896_MonotonicArray {

    public boolean isMonotonic(int[] A) {
        boolean result = true;
        int n = A.length;

        for (int i = 0; i < n -1 ; i++) {
            if (A[i] <= A[i + 1]) {
                continue;
            } else {
                result = false;
                break;
            }
        }

        if (result == true) {
            return result;
        } else {
            for (int i = 0; i < n-1; i++) {
                if (A[i] >= A[i + 1]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
