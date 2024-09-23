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

Java keeps track of execution through frames
Each method introduces frames which contains all the variables and instances
involved in the method. It seems like scope for python.
Post-execution of the method, its associated frame is removed.
the method currently being executed is always on the top of the stack



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
        double avg = average(1, 2, 3, 4);
        System.out.println("The average of 1, 2, ,3, 4 is " + avg);

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
    public static int sum(int number1, int number2, int number3, int number4) {
        // you can copy your implementation of the method sum here
        return number1 + number2 + number3 + number4;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        // write your code here
        // calculate the sum of the elements by calling the method sum
        // practice casting for division
        int sum = sum(number1, number2, number3, number4);
        return (double) sum / 4;
    }

}
