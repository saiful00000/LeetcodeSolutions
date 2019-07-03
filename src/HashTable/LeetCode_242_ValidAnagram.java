package HashTable;

import java.lang.reflect.Array;
import java.util.*;

public class LeetCode_242_ValidAnagram {

    public static void main(String[] args) {

        String s = "aaa";
        String t = "bbb";

        System.out.println(isAnagram(s,t));

    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        int len = sArray.length;
        for (int i = 0; i < len; i++)
            if (sArray[i] != tArray[i])
                return false;

        return true;
    }

}
