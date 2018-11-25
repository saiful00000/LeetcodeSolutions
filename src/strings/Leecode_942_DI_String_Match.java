package strings;

import java.util.Arrays;

public class Leecode_942_DI_String_Match {
    public static int[] diStringMatch(String string) {
        int[] result = new int[string.length() + 1];
        int high = string.length();
        int low = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'I') {
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }
        result[string.length()] = low;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(diStringMatch("IDID")));
    }
}
