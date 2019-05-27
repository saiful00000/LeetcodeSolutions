import java.util.*;

public class Test {

    public static void main(String[] args) {

        String string = "-90e3";
        boolean numeric = true;

        numeric = string.matches("-?\\d+(\\.\\d+)?");

        if (numeric)
            System.out.println(string + " is a number");
        else
            System.out.println(string + " is not a number");
    }

}


