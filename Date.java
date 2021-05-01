/**
QUESTION

Define a class Date with the following data members and member methods

Class Name : Date

Data Members:
Int dd	: integer value to store Day
Int mm	: integer value to store Month
Int yy	: integer value to store year (1900 <= yy <=2100)

Member Methods:
void input()	: Accept dd,mm and yy from the user
void validate()	:Check weather the date is valid
		dd <= 31 when mm is 1,3,5,7,8,10,12
		dd  <=30 when mm is 4, 6,9,11
		dd  <= 28 when mm is 2 and yy is not divisible by 4
        dd  <= 29 when mm is 2 and yy is divisible by 4

*/

import java.util.Scanner;

public class Date {

    int dd;
    int mm;
    int yy;

    public Date() {

        dd = 1;
        mm = 1;
        yy = 2000;

    }

    public void input() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the day of the month : ");
        dd = scanner.nextInt();

        System.out.print("Please enter the month of the year : ");
        mm = scanner.nextInt();

        System.out.print("Please enter the year : ");
        yy = scanner.nextInt();

        scanner.close();

    }

    public void validate() {

        if (1900 <= yy && yy <= 2100) {

            if ((mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) && (dd <= 31))

                System.out.println("The data is valid!");

            else if ((mm == 4 || mm == 6 || mm == 9 || mm == 11) && (dd <= 30))

                System.out.println("The data is valid!");

            else if (((yy % 4) != 0) && (mm == 2) && (dd <= 28))

                System.out.println("The data is valid!");

            else if (((yy % 4) == 0) && (mm == 2) && (dd <= 29))

                System.out.println("The data is valid!");

            else

                System.out.println("The data is invalid!");

        }

        else

            System.out.println("The data is invalid!");

    }

    public static void main(String[] args) {

        Date date = new Date();

        date.input();
        date.validate();

    }

}

/**
OUTPUT

Please enter the day of the month : 30
Please enter the month of the year : 4
Please enter the year : 2021
The data is valid!

*/
