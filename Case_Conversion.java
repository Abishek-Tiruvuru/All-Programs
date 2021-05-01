/**
QUESTION

Write a program to accept a String and convert uppercase letters to lowercase and vice versa.

*/

import java.util.Scanner;

public class Case_Conversion {

    String input;

    char letter;

    public Case_Conversion() {

        input = "";

        letter = 'A';

    }

    public void accept() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a string to convert the uppercase letters to lowercase and vice versa : ");
        input = scanner.next();

        scanner.close();

    }

    public void check_and_display() {

        for (int i = 0; i < input.length(); i++) {

            letter = input.charAt(i);

            if ('a' <= letter && letter <= 'z')

                System.out.print(Character.toUpperCase(letter));

            else if ('A' <= letter && letter <= 'Z')

                System.out.print(Character.toLowerCase(letter));

            else

                System.out.print(letter);

        }

        System.out.println();

    }

    public static void main(String[] args) {

        Case_Conversion case_conversion = new Case_Conversion();

        case_conversion.accept();
        case_conversion.check_and_display();

    }

}

/**
OUTPUT

Please enter a string to convert the uppercase letters to lowercase and vice versa : Jonathan123
jONATHAN123

*/
