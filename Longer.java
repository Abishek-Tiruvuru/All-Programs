/**
QUESTION

Write a program to accept 2 Strings and Print the longest String.

*/

import java.util.Scanner;

public class Longer {

    String output;

    String string_1;
    String string_2;

    int length_1;
    int length_2;

    public Longer() {

        output = "";

        string_1 = "";
        string_2 = "";

        length_1 = 0;
        length_2 = 0;

    }

    public void accept() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a string : ");
        string_1 = scanner.next();

        System.out.print("Please enter another string to check  which is longer : ");
        string_2 = scanner.next();

        System.out.println();

        length_1 = string_1.length();
        length_2 = string_2.length();

        scanner.close();

    }

    public void check() {

        if (length_1 < length_2)

            output = string_2;

        else if (length_1 > length_2)

            output = string_1;

        else

            output = "Both are equal in length.";

    }

    public void display() {

        System.out.println(output);

    }

    public static void main(String[] args) {

        Longer longer = new Longer();

        longer.accept();
        longer.check();
        longer.display();

    }

}

/**
OUTPUT

Please enter a string : Jonathan
Please enter another string to check  which is longer : Jonathan.I.K

Jonathan.I.K

*/
