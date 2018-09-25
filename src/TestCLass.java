import java.util.HashMap;
import java.util.Map;

public class TestCLass {

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(1,3);

        System.out.println(map);
    }
}