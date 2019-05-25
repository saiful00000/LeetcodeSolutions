package maths;

public class Leetcode_202_HappyNumber {
    public static void main(String[] args) {
        int number = 1;
        System.out.println(happyNumber(number));
    }

    static boolean happyNumber(int number) {
        int slow;
        int fast;
        slow = fast = number;
        do {
            slow = sumOfSqr(slow);
            fast = sumOfSqr(sumOfSqr(fast));
        }while (slow != fast);
        return (slow == 1);
    }

    static int sumOfSqr(int number) {
        int sum = 0;
        while (number != 0) {
            sum += (number % 10) * (number % 10);
            number /= 10;
        }
        return sum;
    }
}
