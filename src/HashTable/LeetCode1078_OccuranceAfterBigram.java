package HashTable;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode1078_OccuranceAfterBigram {

    public static void main(String[] args) {
        String text = "alice is a good girl she is a good student";
        String first = "a";
        String second = "good";

        String[] res = findOcurrences(text, first, second);

        System.out.println(Arrays.toString(res));
    }

    public static String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> list = new ArrayList<>();
        String[] result;
        String arr[] = text.split(" ");
        int len = arr.length - 1;

        for (int i = 0; i <= len; i++) {
            System.out.println(arr[i]);
            if (arr[i].equals(first) && i < len) {
                if (arr[i + 1].equals(second) && i < len) {
                    if (i + 2 <= len)
                        list.add(arr[i+2]);
                    System.out.println(arr[i+2]);
                    i++;
                }
            }
        }

        int index = 0;
        result = new String[list.size()];
        for (String s: list) {
            result[index++] = s;
        }

        return result;
    }
}
