package easys;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_705_DesignHashSet {

    List<Integer> list = new ArrayList<>();

    public LeetCode_705_DesignHashSet() {

    }

    public void add(int key) {
        if(list.size() == 0){
            list.add(key);
        } else if (!list.contains(key)) {
            list.add(key);
        }
    }


    public void remove(int key) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == key){
                list.remove(i);
            }
        }
    }

    public boolean contains(int key) {
        if (list.contains(key))
            return true;
        return false;
    }

    public static void main(String[] args) {
        LeetCode_705_DesignHashSet set = new LeetCode_705_DesignHashSet();
        set.add(1);
        set.add(2);
        System.out.println(set.contains(1));
        System.out.println(set.contains(3));
        set.add(2);
        System.out.println(set.contains(2));
        set.remove(2);
        System.out.println(set.contains(2));
    }

}
