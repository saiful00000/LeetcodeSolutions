package arrays;

public class Leetcode_485_MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxOnes = 0;
        int count = 0;

        for (int v : nums) {
            if (v == 1) {
                count++;
            } else {
                if(maxOnes < count){
                    maxOnes = count;
                }
                count = 0;
            }
        }
        if(maxOnes < count){
            maxOnes = count;
        }

        return maxOnes;
    }

    public static void main(String[] args) {
        int[] a  = {0};
        System.out.println(findMaxConsecutiveOnes(a));
    }

}
