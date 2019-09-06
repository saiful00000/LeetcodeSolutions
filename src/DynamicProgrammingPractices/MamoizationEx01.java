package DynamicProgrammingPractices;

public class MamoizationEx01 {

    final int MAX = 100;
    final int NIL = -1;

    int[] lookUp = new int[MAX];

    public void init() {
        for (int i = 0; i < MAX; i++) {
            lookUp[i] = NIL;
        }
    }


    public int fibo(int n) {
        if (lookUp[n] == NIL) {
            if (n <= 1) {
                lookUp[n] = n;
            } else {
                lookUp[n] = fibo(n - 1) + fibo(n - 2);
            }
        }
        return lookUp[n];
    }

    public static void main(String[] args) {
        MamoizationEx01 ob = new MamoizationEx01();

        ob.init();
        System.out.println(ob.fibo(5));
    }

}
