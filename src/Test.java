public class Test {
    public static void printY(int y) {
        if (y > 0) {
            System.out.println(y);
            printY(y-1);
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        printY(5);
    }
}
