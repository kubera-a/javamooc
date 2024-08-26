import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + number);
    }
}
