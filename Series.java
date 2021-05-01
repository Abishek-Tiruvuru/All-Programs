/**
QUESTION

Write a program to compute and display the sum of the following series:-
1+2/1X2+1+2+3/1X2X3+1+2+3+4/1X2X3X4+1+2+3+4/1X2X3X4+ . ……  1+2+3+4+ .../n1X2X3X4X .... n

Use separate functions for denominator and numerator.

*/

import java.util.Scanner;

public class Series {

    static int factorial;

    int n;

    public Series() {

        factorial = 0;
        n = 0;

    }

    public void accept() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number as the limit of the series : ");
        n = scanner.nextInt();

        scanner.close();

    }

    public static int numerator(int n) {

        for (int i = 1; i <= n; i++) {

            factorial =+ i;

        }

        return factorial;

    }

    public static int denominator(int n) {

        factorial = 1;

        for (int i = 1; i <= n; i++) {

            factorial *= i;

        }

        return factorial;

    }

    public void display() {

        System.out.println(numerator(n) + " / " + denominator(n));

    }

    public static void main(String[] args) {

        Series series = new Series();

        series.accept();
        series.display();

    }

}

/**
OUTPUT

Please enter a number as the limit of the series : 5
5 / 120

*/
