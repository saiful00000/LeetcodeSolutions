package BinarySearch;

public class Leetcode_441_Arranging_Coins {

    public static int arrangeCoins(int n) {
        int stires = 1;
        int count = 0;
        while (stires <= n) {
            n = n - stires;
            stires++;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }
}
