import java.util.*;

public class TestCLass {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        String s = "";

        for (int i = 0; i < a.length; i++) {
            s += a[i];
        }

        System.out.println(s);

        StringBuilder ss = new StringBuilder("saiful");
        ss.setCharAt(0, 'a');
        System.out.println(ss);

    }
}