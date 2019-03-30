package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode_500_Keyboard_Row {
    public static void main(String[] args) {
        String[] names = {"Hello", "Alaska", "Dad", "Peace"};
        names = findWords(names);
        for (String s : names) {
            System.out.println(s);
        }
    }

    public static String[] findWords(String[] words) {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<Character> firstRow = new ArrayList<Character>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
        ArrayList<Character> secondRow = new ArrayList<Character>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
        ArrayList<Character> thirsRow = new ArrayList<Character>(Arrays.asList('z','x','c','v','b','n','m'));
        int index = 0;
        for (String word: words) {
            int len = word.length();
            int atRowLen = 0;
            word = word.toLowerCase();
            if (firstRow.contains(word.charAt(0))) {
                for (int i = 0; i < len; i++) {
                    if (firstRow.contains(word.charAt(i)))
                        atRowLen++;
                }
            } else if (secondRow.contains(word.charAt(0))) {
                for (int i = 0; i < len; i++) {
                    if (secondRow.contains(word.charAt(i)))
                        atRowLen++;
                }
            } else {
                for (int i = 0; i < len; i++) {
                    if (thirsRow.contains(word.charAt(i)))
                        atRowLen++;
                }
            }
            if (atRowLen == len) result.add(words[index]);
            index++;
        }
        return result.toArray(new String[result.size()]);
    }
}
