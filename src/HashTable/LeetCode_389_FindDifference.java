package HashTable;

import java.util.Arrays;

public class LeetCode_389_FindDifference {

    public static void main(String[] args) {

    }

    public char findTheDifference(String s, String t) {

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        int len = sArray.length;
        for (int i = 0; i < len; i++)
            if (sArray[i] != tArray[i])
                return tArray[i];

        return tArray[len];

    }

}
