package strings;

import java.util.*;

public class LeetCode_884_Unommon_Word_From_Two_Sentence {

    public String[] uncommonFromSentences(String A, String B) {
        if (A.length() == 0 && B.length() == 0) return null;
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        String[] arr = A.split(" ");
        for (String s: arr) {
            if (!set.contains(s)) {
                set.add(s);
                list.add(s);
            }else {
                list.remove(s);
            }
        }

        arr = B.split(" ");
        for (String s: arr) {
            if (!set.contains(s)) {
                set.add(s);
                list.add(s);
            }else {
                list.remove(s);
            }
        }

        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
