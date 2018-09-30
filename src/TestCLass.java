import java.util.*;

public class TestCLass {
    public static void main(String[] args) {

        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);
        map.put(4,40);

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getValue());
        }

    }
}



/*
* row = array[0].length
* column = array.length;
* */