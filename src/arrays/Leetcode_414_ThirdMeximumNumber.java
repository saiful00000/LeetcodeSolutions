package arrays;

public class Leetcode_414_ThirdMeximumNumber {

    public static int anInt(int[] nums) {
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for (Integer v : nums) {
            if (v.equals(firstMax) || v.equals(secondMax) || v.equals(thirdMax))
                continue;
            else if (firstMax == null || v > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = v;
            }
            else if (secondMax == null || v > secondMax) {
                thirdMax = secondMax;
                secondMax = v;
            }
            else if (thirdMax == null || v > thirdMax) {
                thirdMax = v;
            }
        }
        if(thirdMax == null)
            return firstMax;
        else
            return thirdMax;
    }

    /*public static void main(String[] args) {
        int[] nums = {1,2,1,2,3,3,4};
        System.out.println(anInt(nums));
    }*/
}