/**
QUESTION

Accept a String and check whether the 1st character is uppercase or lowercase.

*/

import java.util.Scanner;

public class Letter_1 {

    String input;
    String output;

    char letter;

    public Letter_1() {

        input = "";
        output = "";

        letter = 'A';

    }

    public void accept() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a string : ");
        input = scanner.next();

        letter = input.charAt(0);

        scanner.close();

    }

    public void check() {

        if ('a' <= letter && letter <= 'z')

            output = "The 1st charecter is lowercase.";

        else if ('A' <= letter && letter <= 'Z')

            output = "The 1st charecter is uppercase.";

        else

            output = "The 1st charecter is not an alphabetical letter";

    }

    public void display() {

        System.out.println(output);

    }

    public static void main(String[] args) {

        Letter_1 letter_1 = new Letter_1();

        letter_1.accept();
        letter_1.check();
        letter_1.display();

    }

}

/**
OUTPUT

Please enter a string : Jonathan
The 1st charecter is uppercase.

*/
