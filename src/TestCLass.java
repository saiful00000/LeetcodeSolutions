import java.util.HashMap;
import java.util.Map;

public class TestCLass {

    public static void main(String[] args) {
        int[] nums = {0,1,1,3,3};
        int k = 4;
        int n = nums.length;
        for (int i = 0; i <= n-k; i++) {
            for (int j = i; j < i+k; j++) {
                System.out.print(nums[j] +" ");
            }
            System.out.println();
        }
    }
}