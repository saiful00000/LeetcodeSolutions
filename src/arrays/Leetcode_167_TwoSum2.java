package arrays;

public class Leetcode_167_TwoSum2 {

    public static int[] twoSum(int[] numbers, int target) {
        int startPoint = 0;
        int endPoint = numbers.length-1;

        while (numbers[startPoint] + numbers[endPoint] != target) {
            if (numbers[startPoint] + numbers[endPoint] < target)
                startPoint++;
            else
                endPoint--;
        }
        return new int[]{startPoint+1, endPoint+1};
    }
}
