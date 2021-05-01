/**
QUESTION

Design a class CabService with the following
Member variables / data members
String car_Type  : To store the type of car (AC or NON AC)
double km    : to store the kilometer travelled
double bill   : to calculate and store the bill amount

Member methods:
CabService ()  - Default constructor to initialize data members string data members to “” and double data members to  0.0
void accept () - to accept car_type and km (Using Scanner class only)
void calculate () - to calculate the bill as per the rules given.
void display () - display the bill format
	CAR TYPE  :
	KILOMETER TRAVELLED :
	TOTAL BILL :
			AC			NON AC
UPTO 5 KM		Rs. 150/-		Rs.120/-
Beyond 5 KM		Rs.10/- Per KM	Rs. 8/- Per KM

Create a main method and invoke the member functions.

*/

import java.util.Scanner;

public class Cab_Service {

    String car_Type;

    double km;
    double bill;

    public Cab_Service() {

        car_Type = "";
        
        km = 0.0;
        bill = 0.0;

    }

    public void accept() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the type of car you would like to travel in (AC or NON AC) : ");
        car_Type = scanner.next();

        System.out.print("Please enter the number of kilometers you are going to travel in that car : ");
        km = scanner.nextInt();

        System.out.println();

        scanner.close();

    }

    public void calculate() {

        if (car_Type.equals("AC")) {

            if (km <= 5)

                bill = 150.0;

            else

                bill = (150.0 + ((km - 5.0) * 10.0));

        }

        else {

            if (km <= 5)

                bill = 120.0;

            else

                bill = (120.0 + ((km - 5.0) * 8.0));

        }

    }

    public void display() {

        System.out.println("CAR TYPE\t\t:\t" + car_Type);
        System.out.println("KILOMETER TRAVELLED\t:\t" + km);
        System.out.println("TOTAL BILL\t\t:\t" + bill);

    }

    public static void main(String[] args) {

        Cab_Service cab_service = new Cab_Service();

        cab_service.accept();
        cab_service.calculate();
        cab_service.display();

    }

}

/**
OUTPUT

Please enter the type of car you would like to travel in (AC or NON AC) : AC
Please enter the number of kilometers you are going to travel in that car : 10

CAR TYPE                :       AC
KILOMETER TRAVELLED     :       10.0
TOTAL BILL              :       200.0

*/
