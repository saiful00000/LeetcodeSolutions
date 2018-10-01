package maths;

public class Leetcode_09_PalindromeNumber {
    public boolean isPalindrome(int number) {
        if (number < 0)
            return false;

        int tempo = number, newNumber = 0, r;

        while (number > 0) {
            r = number % 10;
            newNumber = (newNumber * 10) + r;
            number = number / 10;
        }
        return tempo == newNumber ? true:false;
    }
}
