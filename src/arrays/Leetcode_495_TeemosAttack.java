package arrays;

public class Leetcode_495_TeemosAttack {

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0)
            return 0;

        int total = duration;
        for (int i = 1; i < timeSeries.length; i++) {
            total += Math.min(duration, timeSeries[i] - timeSeries[i-1]);
        }
        return total;
    }
}
