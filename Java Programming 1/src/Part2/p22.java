package Part2;

import java.util.Scanner;

public class p22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Exit? (y/n)");
            String input = scanner.nextLine();
            if (input.equals("n")) {
                break;
            }
        }

        System.out.println("Let's continue!");

        while (true) {
            System.out.println("Enter a positive number:  or 0 to exit");

            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else if (number < 0){
                System.out.println("You entered an invalid input " + number);
                continue;
            } else {
                System.out.println("You entered: " + number);
            }
        }
    }
}
