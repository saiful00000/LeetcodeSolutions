import java.util.LinkedList;
import java.util.PriorityQueue;

public class Test {


    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int[] a = {1,2,3,6,2,3,4,7,8};

        for (int v:a) {
            q.add(v);
        }

        System.out.println(q);

        q.remove(1);

        System.out.println(q);
    }
}
