package Greedy;

public class Leetcode_944_Delete_Column_To_Make_Sorted {
    public static int minDeletionSize(String[] strings) {
        int result = 0;
        for (int i = 0; i < strings[0].length(); i++) {
            for (int j = 0; j < strings.length - 1; j++) {
                if (strings[j].charAt(i) > strings[j + 1].charAt(i)) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strings = {"abcd","eagh","ijal"};
        System.out.println(minDeletionSize(strings));
    }
}
