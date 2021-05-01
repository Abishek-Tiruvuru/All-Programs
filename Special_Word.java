/**
QUESTION

Special words are those words which start and end with the same letter.
Example : EXISTENCE, COMIC, WINDOW
Palindrome words are those words which read the same from left to right and vice-versa.
Example : MALYALAM, MADAM, LEVEL, ROTATOR, CIVIC
All palindromes are special words but all special words are not palindromes.

Write a program to accept a word. Check and display whether the word is a palindrome or only a
special word or none of them.

*/

import java.util.Scanner;

public class Special_Word {

    String input;
    String output;

    int length;

    public Special_Word() {

        input = "";
        output = "";

        length = 1;

    }

    public void accept() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a string to check if it is a 'Special Word' or 'Palindrome' : ");
        input = scanner.next();

        input = input.toLowerCase();

        length = (input.length() - 1);

        scanner.close();

    }

    public static boolean check(String input, int length) {

        for (int i = 0; i < length; i++) {

            if (input.charAt(i) != input.charAt(length))

                return false;

            length--;

        }

        return true;

    }

    public void display() {

        if (check(input, length))

            System.out.println("The string is a 'Palindrome'.");

        else if (input.charAt(0) == input.charAt(length))

            System.out.println("The string is a 'Special Word'.");

        else

            System.out.println("The string is not a 'Special Word' or a 'Palindrome'.");

    }

    public static void main(String[] args) {

        Special_Word special_word = new Special_Word();

        special_word.accept();
        special_word.display();

    }

}

/**
OUTPUT

Please enter a string to check if it is a 'Special Word' or 'Palindrome' : Nitin
The string is a 'Palindrome'.

*/
