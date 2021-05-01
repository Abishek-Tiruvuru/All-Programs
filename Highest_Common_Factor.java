/**
QUESTION

Write a program to accept 2 numbers and find HCF of those two numbers

*/

import java.util.Scanner;

public class Highest_Common_Factor {

    int number_1;
    int number_2;

    int highest_common_factor;

    public Highest_Common_Factor() {

        number_1 = 0;
        number_2 = 0;

        highest_common_factor = 0;

    }

    public void accept() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        number_1 = scanner.nextInt();

        System.out.print("Please enter another number : ");
        number_2 = scanner.nextInt();

        System.out.println();

        scanner.close();

    }

    public void check() {

        for (int i = 1; i <= number_1 || i <= number_2; i++) {

            if ((number_1 % i) == 0 && (number_2 % i) == 0)

                highest_common_factor = i;

        }

    }

    public void display() {

        System.out.println("The highest common factor is " + highest_common_factor + ".");

    }

    public static void main(String[] args) {

        Highest_Common_Factor highest_common_factor = new Highest_Common_Factor();

        highest_common_factor.accept();
        highest_common_factor.check();
        highest_common_factor.display();

    }

}

/**
OUTPUT

Please enter a number : 12
Please enter another number : 36

The highest common factor is 12.

*/
