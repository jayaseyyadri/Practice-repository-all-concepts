package mooc;

import java.util.Scanner;

public class sumOfSequence {
    /**Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number?");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i <= lastNumber; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);

    }
}