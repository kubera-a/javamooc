import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");

        String message = scanner.nextLine();

        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }
}
