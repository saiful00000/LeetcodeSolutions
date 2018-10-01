package arrays;

public class Leetcode_565_ArrayNesting {

    public static int arrayNesting(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n];
        int s, maxCount = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int temp = nums[i];
                int count = 0;

                do {
                    temp = nums[temp];
                    count++;
                    visited[temp] = true;
                }
                while (temp != nums[i]);
                maxCount = Math.max(maxCount,count);
            }
        }
        return maxCount;
    }
}
