import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestCLass {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("s");
        list.add("a");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        if (list.contains("s")) {
            list.remove("a");
        }
        System.out.println(list);
    }
}