package mooc;

import java.util.Scanner;
/**Write a program that reads numbers from the user until the user inputs a number 0. After this the program outputs the sum of the numbers. The number zero does not need to be added to the sum, even if it does not change the result*/
public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            sum += number;
            if (number == 0) {
                System.out.println("Sum of the numbers: " + sum);
                break;
            }

        }
    }
}
