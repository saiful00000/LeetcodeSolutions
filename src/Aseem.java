public class Aseem {

    public static int n = 9;


    public static void main(String[] args) {


        for (int rows = 0; rows < n; rows++) {
            // a
            for (int cols = 0; cols <= n / 2; cols++) {
                if (rows == 0 && cols != 0 && cols != n / 2
                        || rows == n / 2
                        || cols == 0 && rows != 0
                        || cols == n / 2 && rows != 0) {
                    System.out.print("A ");
                } else {
                    System.out.print("  ");
                }
            }
            //System.out.print(" ");

            // s
            for (int cols = 0; cols < n; cols++) {
                if (cols == 0 && rows < n / 2 && rows != 0 && rows != n / 2
                        || cols == n - 1 && rows > n / 2 && rows != n / 2 && rows != n - 1
                        || rows == 0 && cols != 0
                        || rows == n / 2 && cols != n - 1 && cols != 0
                        || rows == n - 1 && cols != n - 1) {
                    System.out.print("S ");
                } else {
                    System.out.print("  ");
                }
            }
            //System.out.print(" ");

            // e
            for (int cols = 0; cols < n; cols++) {
                if (rows == 0 || rows == n / 2 && cols <= n / 2 || rows == n - 1 || cols == 0) {
                    System.out.print("E ");
                } else {
                    System.out.print("  ");
                }

            }
            //System.out.print(" ");
            for (int cols = 0; cols < n; cols++) {
                if (rows == 0 || rows == n / 2 && cols <= n / 2 || rows == n - 1 || cols == 0) {
                    System.out.print("E ");
                } else {
                    System.out.print("  ");
                }

            }
            //System.out.print(" ");


            //m

            for (int cols = 0; cols < n; cols++) {
                if (cols == 0
                        || cols == n - 1
                        || rows == cols && rows <= n / 2
                        || rows + cols == n - 1 && rows <= n / 2) {
                    System.out.print("M ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }



}
