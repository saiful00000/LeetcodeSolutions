import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestCLass {

    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{6,7,8}};

        for(int j = 0; j < array.length; j++){
            for(int i = 0; i < array[j].length / 2; i++) {
                int temp = array[j][i];
                array[j][i] = array[j][array[j].length - i - 1];
                array[j][array[j].length - i - 1] = temp;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }
}