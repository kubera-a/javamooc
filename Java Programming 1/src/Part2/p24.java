package Part2;

import java.util.Scanner;

/*
Methods and dividing the program into smaller parts:

Key concepts:

Writing your own methods
Where to put your methods?
void means no return value
return values must always be stored

This is just the equivalent to writing python functions but with typehints
Some of it is just establishing scope



 */

public class p24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //program logic
        System.out.println("Enter the number of times to say hello!");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            sayHello();
        }

        sayHelloWhile(n);

    }



    public static void greet() {
        System.out.println("Baby's first method awwww~~");
    }

    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static void sayHelloWhile(int n) {
        int i = 0;

        while (i < n) {
            System.out.println("Hello!");
            i++;
        }
    }

    public static int faultyMethod() {
        return 10;
        // The below fails during compile time as it can't be reached!
//        System.out.println("I claim to return an integer, but I don't.");
    }

}
