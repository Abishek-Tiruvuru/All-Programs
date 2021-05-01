/**
QUESTION

Write a program to accept a number from the user and generate all the twin prime numbers from 2 to n.
[Write 2 functions, one for checking a number is prime or not another to generate twin prime numbers.]

Sample

input
10
Output
Twin Prime numbers are
3.5
5.7

*/

import java.util.Scanner;

public class Prime_Numbers {

    int number;
    int range;

    public Prime_Numbers() {

        number = 0;
        range = 0;

    }

    public void accept_and_display() {

        Scanner scanner  = new Scanner(System.in);

        System.out.print("Please enter a number to check if it is a prime number : ");
        number = scanner.nextInt();

        if (check(number))

            System.out.println("The number is a prime number.");

        else

            System.out.println("The number is not a prime number.");

        System.out.println();

        System.out.print("Please enter a number as the limit to the twin prime numbers generation : ");
        range = scanner.nextInt();

        scanner.close();

    }

    public static boolean check(int number) {

        if (number < 2)

            return false;

        for (int i = 2; i <= (number / 2); i++) {

            if ((number % i) == 0)

                return false;

        }

        return true;

    }

    public void generate() {

        System.out.println("Twin Prime numbers are");

        for (int i = 2; i < range; i++) {

            if (check(i) && check(i + 2))

                System.out.println(i + "." + (i + 2));

        }

        System.out.println();

    }

    public static void main(String[] args) {

        Prime_Numbers prime_numbers = new Prime_Numbers();

        prime_numbers.accept_and_display();
        prime_numbers.generate();

    }

}

/**
OUTPUT

Please enter a number to check if it is a prime number : 23
The number is a prime number.

Please enter a number as the limit to the twin prime numbers generation : 23
Twin Prime numbers are
3.5
5.7
11.13
17.19

*/
