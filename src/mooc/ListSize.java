package mooc;

import java.util.ArrayList;
import java.util.Scanner;

    public class ListSize {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            ArrayList<String> list = new ArrayList<>();
            while (true) {
                sum++;
                String input = scanner.nextLine();
                if (input.equals("")) {
                    sum = sum-1;
                    System.out.println("In total:"+sum);
                    break;
                }

                list.add(input);
            }

        }
    }


