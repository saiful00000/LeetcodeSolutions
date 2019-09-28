package ICPC;

public class A {
    public static void main(String[] args) {
        String s = "abbabaabbaababbabaababbaa";
        String p = "abbab";
        int k = 3;

        int result = 0;

        // tmp
        int tmp = 0;

        char[] array = s.toCharArray();
        char[] subarray = p.toCharArray();

        for (int i = 0; i < s.length()-(p.length()-1); i++) {
            tmp++;
            int subIndex = 0;
            int count = 0;
            for (int j = i; j < i + (p.length()-1); j++) {
                if (array[j] != subarray[subIndex]) {
                    count++;
                    subIndex++;
                }
            }
            if (count <= k) {
                result++;
            }
        }

        System.out.println(result);
        System.out.println(tmp);
        System.out.println(s.length());
    }
}
