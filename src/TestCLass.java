import java.util.*;

public class TestCLass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list.add(1);
        list2.add(1);

        if (list.equals(list2))
            System.out.println("yes");
        else
            System.out.println("not");

    }
}