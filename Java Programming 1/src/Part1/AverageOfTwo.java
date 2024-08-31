package Part1;

import java.util.Scanner;

public class AverageOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.print("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        double average = (firstNumber + secondNumber) / 2.0;
        System.out.println("The average is " + average);
    }
}
