/**
QUESTION

Write a program to try equals and equalsIgnoreCase functions.

*/

import java.util.Scanner;

public class Equality {

    String output_1;
    String output_2;

    String string_1;
    String string_2;

    public Equality() {

        output_1 = "";
        output_2 = "";

        string_1 = "";
        string_2 = "";

    }

    public void accept() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a string : ");
        string_1 = scanner.next();

        System.out.print("Please enter another string to check its equality with the previous string : ");
        string_2 = scanner.next();

        System.out.println();

        scanner.close();

    }

    public void check() {

        if (string_1.equals(string_2))

            output_1 = "The strings are equal (.equals() function).";

        else

            output_1 = "The strings are not equal (.equals() function).";

        if (string_1.equalsIgnoreCase(string_2))

            output_2 = "The strings are equal (.equalsIgnoreCase() function).";

        else

            output_2 = "The string are not equal (.equalsIgnoreCase() function).";

    }

    public void display() {

        System.out.println(output_1);
        System.out.println(output_2);

    }

    public static void main(String[] args) {

        Equality equality = new Equality();

        equality.accept();
        equality.check();
        equality.display();

    }

}

/**
OUTPUT

Please enter a string : Jonathan
Please enter another string to check its equality with the previous string : jonathan

The strings are not equal (.equals() function).
The strings are equal (.equalsIgnoreCase() function).

*/
