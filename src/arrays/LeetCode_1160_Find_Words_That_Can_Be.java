package arrays;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_1160_Find_Words_That_Can_Be {

    public int countCharacters(String[] words, String chars) {
        int lenths = 0;
        int[] charsSet = new int[26];

        for (int i = 0; i < chars.length(); i++) {
            charsSet[chars.charAt(i) - 'a']++;
        }

        for (String word: words) {
            int[] copySet = charsSet.clone();
            if (exist(word, copySet)) {
                lenths += word.length();
            }
        }

        return lenths;
    }

    public boolean exist(String word, int[] copySet) {
        for (int i = 0; i < word.length(); i++) {
            if (copySet[word.charAt(i) - 'a'] == 0) {
                return false;
            } else {
                copySet[word.charAt(i) - 'a']--;
            }
        }
        return true;
    }

}
