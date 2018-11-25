package maths;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_728_SelfDividingNumber {

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1,22));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDivide(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static boolean isSelfDivide(int number) {
        int num = number;
        while (number > 0) {
            int dv = number % 10;
            number = number / 10;
            if (dv == 0 || (num % dv) > 0) {
                return false;
            }
        }
        return true;
    }
}
