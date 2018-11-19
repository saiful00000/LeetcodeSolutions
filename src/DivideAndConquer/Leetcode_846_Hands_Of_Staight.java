package DivideAndConquer;

import java.util.PriorityQueue;

public class Leetcode_846_Hands_Of_Staight {

    public static boolean isNStraightHand(int[] hand, int w) {

        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int v : hand) {
            q.add(v);
        }

        while (!q.isEmpty()) {
            int current = q.poll();
            for (int i = 1; i < w; i++) {
                if (q.remove(current+i))
                    continue;
                else
                    return false;
            }
        }
        return true;
    }
}
