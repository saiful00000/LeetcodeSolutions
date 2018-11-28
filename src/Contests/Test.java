package Contests;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int number = -8;
        ArrayList<Integer> result = new ArrayList<>();

        int remainder = 0;
        boolean finish = false;

        while (!finish) {
            if (number == 0) {
                finish = true;
            } else {
                remainder = number % 7;
                number = number / 7;
                result.add(remainder);
            }
            remainder = 0;
        }
        for (int i = result.size()-1; i >=0 ; i--) {
            int a = result.get(i);
            System.out.print(a);
        }
        System.out.println();
    }
}
