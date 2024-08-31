package Part1;

import java.util.Scanner;

public class BooleanInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write something:");
        Boolean flag = Boolean.valueOf(scanner.nextLine());
        System.out.println("You wrote " + flag);
    }
}
