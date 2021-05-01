/**
QUESTION

Define a class with 3 void functions with the name area

with 1 parameter which can calculate area of square

with 2 integer parameters you calculate area of rectangle

with one integer and double value (PI Value = 3.14) calculate the area of circle.

*/

import java.util.Scanner;

public class Overloaded_Functions {

    int side;
    int length;
    int breadth;
    int radius;

    double pi;

    public Overloaded_Functions() {

        side = 0;
        length = 0;
        breadth = 0;
        radius = 0;

        pi = 3.14;

    }

    public void accept_and_display() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the length of the square : ");
        side = scanner.nextInt();

        Area(side);

        System.out.println();

        System.out.print("Please enter the length of the rectangle : ");
        length = scanner.nextInt();

        System.out.print("Please enter the breadth of the rectangle : ");
        breadth = scanner.nextInt();

        Area(length, breadth);

        System.out.println();

        System.out.print("Please enter the radius of the circle : ");
        radius = scanner.nextInt();

        Area(pi, radius);

        System.out.println();

        scanner.close();

    }

    public static void Area(int side) {

        int area = (side * side);

        System.out.println("The area of the square is " + area + ".");

    }

    public static void Area(int length, int breadth) {

        int area = (length * breadth);

        System.out.println("The area of the rectangle is " + area + ".");

    }

    public static void Area(double pi, int radius) {

        double area = (pi * radius * radius);

        System.out.println("The area of the circle is " + area + ".");

    }

    public static void main(String[] args) {

        Overloaded_Functions overloaded_functions = new Overloaded_Functions();

        overloaded_functions.accept_and_display();

    }

}

/**
OUTPUT

Please enter the length of the square : 2
The area of the square is 4.

Please enter the length of the rectangle : 3
Please enter the breadth of the rectangle : 4
The area of the rectangle is 12.

Please enter the radius of the circle : 5
The area of the circle is 78.5.

*/
