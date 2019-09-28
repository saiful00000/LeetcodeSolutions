package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode_475_Heaters {

     static int findRadius(int[] houses, int[] heaters) {
         Arrays.sort(houses);
         Arrays.sort(heaters);

         int index = 0;
         int result = 0;

         for (int house : houses) {
             while (index + 1 < heaters.length && Math.abs(heaters[index] - house) >= Math.abs(heaters[index+1]-house))
                 index++;

             result = Math.max(result, Math.abs(heaters[index] - house));
         }

         return result;
     }
}
