package Part1;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        /* Control flow practice */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter your second number: ");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is greater than " + secondNumber);
        }
        else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " is less than " + secondNumber);
        }
        else if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " is equal to " + secondNumber);
        }
        System.out.println("Goodbye!");

        /* Practice with and && || not ! */

        if ((firstNumber % 2 == 0) && (secondNumber % 2 == 0)) {
            System.out.println("Both numbers are even");
        } else if (firstNumber % 2 == 0 || secondNumber % 2 == 0) {
            System.out.println("One of the numbers is odd") ;
        } else {
            System.out.println("Both numbers are odd");
        }

        // Practice with string equating
        String firstNumberString = String.valueOf(firstNumber);
        String secondNumberString = String.valueOf(secondNumber);

        if (firstNumberString.equals(secondNumberString)) {
            System.out.println("The string values of the two are equal!");
        }
    }
}
