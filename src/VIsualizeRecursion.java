public class VIsualizeRecursion {
    public static void main(String []args) {
        new VIsualizeRecursion().reduceByOne(10);
    }

    public void reduceByOne(int n) {
        System.out.println("Before "+n);
        if(n >= 0) {
            reduceByOne(n-1);
            System.out.println("Inside "+n);
        }
        System.out.println("After "+n);
    }
}
