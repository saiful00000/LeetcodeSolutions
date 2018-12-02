import java.util.*;

public class Test {

    public static String largestTimeFromDigits(int[] A) {
        String s  = "";
        int count = 0;
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 0; i--) {
            if(A[i] <= 2){
                s += A[i];
                A[i] = -1;
                break;
            }
        }
        if(s.length() != 1) return "a";
        for(int i = A.length-1; i >= 0; i--)
            if(A[i] != -1 && A[i] <= 3){
                s += A[i];
                A[i] = -1;
            }
        if(s.length() != 2) return "b";
        s += ":";
        for(int i = A.length-1; i >= 0; i--)
            if(A[i] != -1 && A[i] <= 5){
                s += A[i];
                A[i] = 0;
                break;
            }
        if(s.length() != 4) return "c";
        for(int i = A.length-1; i >= 0; i--)
            if(A[i] != -1){
                s+= A[i];
                break;
            }
        if(s.length() != 5) return "d";
        return s;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(largestTimeFromDigits(a));
    }
}


