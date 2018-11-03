import java.util.*;

public class TestCLass {
    public static void main(String[] args) {
        Stack<int[]> stack = new Stack<int[]>();
        stack.push(new int[] {1,2});

        int i[] = stack.pop();

        System.out.println(Arrays.toString(i));
    }
}