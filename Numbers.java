/**
QUESTION

A class Numbers contains the following data members and member functions to check for triangular numbers. [ A triangular number is formed by the addition of a consecutive sequence of integers starting from 1.]
Eg.
1 + 2 = 3
1 + 2 + 3 =6
1+ 2 + 3 + 4 =10
1+ 2 + 3 + 4 + 5 = 15
Therefore 3,6,10,15 are triangular numbers.
Class name : Numbers
Data members
n 	: 	integer to be checked whether it is triangular or not.
Member functions
void getnum() 	: 	to accept integer n.
int check(int) 	: 	to check if n is triangular.
void dispnum() 	: 	to display message whether n is triangular or not.
Specify the class Numbers giving details of the functions void getnum(), int check(int) and void dispnum(). The main function need not be written.

*/

import java.util.Scanner;

public class Numbers {

    int n;

    public Numbers() {

        n = 0;

    }

    public void getnum() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number to check if it is a triangular number : ");
        n = scanner.nextInt();

        scanner.close();

    }

    public static int check(int n) {

        int sum = 0;

        if (n < 0)

            return 0;

        for (int i = 1; sum <= n; i++) {

            sum += i;

            if (sum == n)

                return 1;

        }

        return 0;

    }

    public void dispnum() {

        if (check(n) == 1)

            System.out.println("The number is a triangular number.");

        else

            System.out.println("The number is not a triangular number.");

    }

    public static void main(String[] args) {

        Numbers numbers = new Numbers();

        numbers.getnum();
        numbers.dispnum();

    }

}

/**
OUTPUT

Please enter a number to check if it is a triangular number : 6
The number is a triangular number.

*/
