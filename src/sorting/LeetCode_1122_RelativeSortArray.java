package sorting;

import java.util.Arrays;

public class LeetCode_1122_RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int res[] = new int[arr1.length];

        int i = 0;
        int j = 0;

        while(i < arr2.length){
            int v = arr2[i];
            i++;

            int count = 0;

            for(int x = 0; x < arr1.length; x++){
                if(arr1[x] == v){
                    count++;
                    arr1[x] = -1;
                }
            }

            while(count != 0){
                res[j++] = v;
                count--;
            }

        }

        Arrays.sort(arr1);
        for(int k = arr1.length-1; k >= 0; k--){
            if(arr1[k] == -1)
                break;
            else
                res[k] = arr1[k];
        }

        return res;
    }
}
