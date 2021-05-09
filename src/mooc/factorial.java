package mooc;

import java.util.Scanner;

public class factorial {
    /**Implement a program which calculates the factorial of a number given by the user.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int product = 1;
        for (int i = 1; i <= number; i++) {
            product *= i;
        }
        System.out.println("Factorial: " + product);
    }

}
