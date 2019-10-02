package Mukta;

import java.util.Scanner;

public class DiffieHellmanAlgorithm {

    static long power(long a, long  b, long  P) {
        if (b == 1)
            return a;
        else
            return (((long)Math.pow(a, b)) % P);
    }

    //Driver program
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        long  P, G, x, a, y, b, ka, kb;

        System.out.println("Enter a prime number P : ");
        P = in.nextLong();
        System.out.println("Enter primitive root for P G : ");
        G = in. nextLong();
        System.out.println("Enter a prmitive key a : ");
        a = in.nextLong();
        System.out.println("Enter a promotive key b : ");
        b = in.nextLong();

        System.out.println("The value of P : "+ P);
        System.out.println("The value of G : "+ G);
        System.out.println("The private key a for Alice : "+ a);
        x = power(G, a, P);
        b = 3;
        System.out.println("The private key b for Bob : "+ b);

        y = power(G, b, P);
        ka = power(y, a, P);
        kb = power(x, b, P);

        System.out.println("Secret key for the Alice is : "+ ka);
        System.out.println("Secret Key for the Bob is : "+ kb);
    }

}
