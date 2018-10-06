import java.util.*;

public class TestCLass {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;

        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }

        System.out.println(count);
    }
}



/*
* row = array[0].length
* column = array.length;
* */