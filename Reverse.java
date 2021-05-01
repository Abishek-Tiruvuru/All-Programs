/**
QUESTION

Write a program to accept a string and reverse using String Functions.

*/

import java.util.Scanner;

public class Reverse {

    String input;
    String output;

    int length;

    public Reverse() {

        input = "";
        output = "";

        length = 0;

    }

    public void accept() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a string to reverse it : ");
        input = scanner.next();

        length = (input.length() - 1);

        scanner.close();

    }

    public void check_and_display() {

        System.out.print("The reverse of " + input + " is : ");

        for (int i = 0; i <= length; i++) {

            System.out.print(input.charAt(length - i));

        }

        System.out.println();

    }

     public static void main(String[] args) {

         Reverse reverse = new Reverse();

         reverse.accept();
         reverse.check_and_display();

     }

}

/**
OUTPUT

Please enter a string to reverse it : Jonathan
The reverse of Jonathan is : nahtanoJ

*/
