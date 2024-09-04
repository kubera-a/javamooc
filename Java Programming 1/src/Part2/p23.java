package Part2;

import java.util.Scanner;

public class p23 {
    public static void main(String[] args) {
        /* Basic for loop, C-style */

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("We are looping "
                    + (9 - i)
                    + "more times!"
            );
        }

        /* Loop and add until input is reached */

        System.out.println("Print the number to add from 0 until: ");
        int loop_breaker = Integer.valueOf(input.nextLine());
        int result = 0;
        for (int i = 0; i < loop_breaker; i++) {
            result += i;
            System.out.println(result);
        }
    }
}
