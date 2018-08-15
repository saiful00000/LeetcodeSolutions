package easys;

public class Leetcode_66_PlusOne {

    public int[] plusOne(int[] digits) {
        if(digits.length == 0)
            return digits;

        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int result = carry + digits[i];
            if (result == 10) {
                digits[i] = 0;
                carry = 1;
                continue;
            }
            digits[i] = result;
            carry = 0;
            break;
        }
        if (carry == 0) {
            return digits;
        }

        int[] desiredDigits = new int[digits.length+1];
        desiredDigits[0] = 1;
        for (int i = 1; i <desiredDigits.length; i++) {
            desiredDigits[i] = 0;
        }
        return desiredDigits;
    }

}
