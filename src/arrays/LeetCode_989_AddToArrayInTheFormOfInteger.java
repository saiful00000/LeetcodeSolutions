package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode_989_AddToArrayInTheFormOfInteger {

    public static List<Integer> addToArrayForm(int[] array, int numbr) {
        List<Integer> list = new ArrayList<>();
        int len = array.length;

        while (len-- >= 0 || numbr > 0) {
            if (len >= 0) {
                numbr += array[len];
            }
            list.add(numbr % 10);
            numbr /= 10;
        }

        Collections.reverse(list);

        return list;
    }

    public static void main(String[] args) {
        int[] array = {9,9,9,9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(array, 1));
    }
}
