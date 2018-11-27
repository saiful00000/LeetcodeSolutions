package arrays;

public class Leetcode_941_Valid_Mountain_Array {
    public static boolean validMountainArray(int[] a) {
        if (a.length < 3)
            return false;
        if (a[0] >= a[1])
            return false;
        int len = a.length-1;
        int counter = 0;
        int i = 0;
        while (i < len) {
            if (a[i] < a[i+1])
                i++;
            else
                break;
            counter++;
        }
        if (counter == len)
            return false;
        while (counter <= len - 1) {
            if (a[counter] <= a[counter+1])
                return false;
            counter++;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(validMountainArray(a));
    }
}
