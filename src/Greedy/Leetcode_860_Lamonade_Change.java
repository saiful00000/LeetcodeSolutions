package Greedy;

public class Leetcode_860_Lamonade_Change {
    public static boolean lemonadeChange(int[] bils) {
        int five = 0;
        int ten = 0;
        int twoenty = 0;

        for (int bil:bils) {
            if (bil == 5) {
                five++;
            } else if (bil == 10 && five > 0) {
                ten++;
                five--;
            } else if (bil == 20) {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (ten == 0 && five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bils = {5,5,10,10,20};
        System.out.println(lemonadeChange(bils));
    }
}
