package Part1;

import java.util.Scanner;

public class VariousInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String string = scanner.nextLine();
        System.out.println("Give a integer:");
        int integer = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double doubleValue = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean booleanValue = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + doubleValue);
        System.out.println("You gave the boolean " + booleanValue);
    }
}
