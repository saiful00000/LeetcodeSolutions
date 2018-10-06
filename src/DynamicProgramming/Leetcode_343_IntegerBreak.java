package DynamicProgramming;

public class Leetcode_343_IntegerBreak {

    public int integerBreak(int number) {
        if (number == 2) return 1;
        if (number == 3) return 2;

        int product = 1;

        while (number > 4) {
            product *= 3;
            number -= 3;
        }

        product *= number;

        return product;
    }
}
