package Part2;

import java.util.Scanner;

public class scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int ones = 0; // this does not work as ones is 'destroyed' at the end of each loop

            System.out.println("Enter a number (0 exits)");

            int number = Integer.valueOf(sc.nextLine());

            if (number == 0) {
                break;
            }

            if (number == 1) {
                ones = ones + 1;
                System.out.println("Ones is " + ones);
            }
        }
    }
}
