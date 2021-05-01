/**
QUESTION

Write a program to accept 2 Strings *str1, str2)  and compare and print the output.

*/

import java.util.Scanner;

public class Compare {

    String string_1;
    String string_2;
    
    String output;

    int compared;

    public Compare() {

        string_1 = "";
        string_2 = "";

        output = "";

        compared = 0;

    }

    public void accept() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a string : ");
        string_1 = scanner.next();

        System.out.print("Please enter another string to compare with the previous string : ");
        string_2 = scanner.next();

        System.out.println();

        scanner.close();

    }

    public void check() {

        compared = string_1.compareTo(string_2);

        if (compared == 0)

            output = "The strings are the same.";

        else

            output = "The strings are not the same.";

    }

    public void display() {

        System.out.println(output);

    }

    public static void main(String[] args) {

        Compare compare = new Compare();

        compare.accept();
        compare.check();
        compare.display();

    }

}

/**
OUTPUT

Please enter a string : jonathan
Please enter another string to compare with the previous string : jonathan

The strings are the same.

*/
