/**
QUESTION

Write a program to print the even numbers from 1 to n. And their squares, where n is provided by the user

*/

import java.util.Scanner;

public class Even_Numbers {

    int range;
    int squared_number;

    public Even_Numbers() {

        range = 0;
        squared_number = 0;

    }

    public void accept() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number as the range of the even numbers generation : ");
        range = scanner.nextInt();

        System.out.println();

        scanner.close();

    }

    public void generate_even_numbers() {

        System.out.println("Even Numbers : ");

        for (int i = 0; i <= range; i += 2) {

            System.out.print(i);

            if (i == range)

                System.out.print(".");

            else

                System.out.print(", ");

        }

        System.out.println();

    }

    public void generate_squared_even_numbers() {

        System.out.println("Squared Even Numbers : ");

        for (int i = 0; i <= range; i += 2) {

            squared_number = i * i;

            System.out.print(squared_number);

            if (i == range)

                System.out.print(".");

            else

                System.out.print(", ");

        }

        System.out.println();

    }

    public static void main(String[] args) {

        Even_Numbers even_numbers = new Even_Numbers();

        even_numbers.accept();
        even_numbers.generate_even_numbers();
        even_numbers.generate_squared_even_numbers();

    }

}

/**
OUTPUT

Please enter a number as the range of the even numbers generation : 12

Even Numbers :
0, 2, 4, 6, 8, 10, 12.
Squared Even Numbers :
0, 4, 16, 36, 64, 100, 144.

*/
