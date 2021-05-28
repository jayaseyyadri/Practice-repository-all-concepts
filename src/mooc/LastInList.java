package mooc;
import java.util.ArrayList;
import java.util.Scanner;
public class LastInList {

    /**Your task is to modify the method to print the last read value after it stops reading. Print the value that was read last from the list. Use the method that tells the size of a list to help you.
     */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            ArrayList<String> list = new ArrayList<>();
            while (true) {
                String input = scanner.nextLine();
                if (input.equals("")) {
                    break;
                }

                list.add(input);
            }
            System.out.println(list.get(list.size() - 1));
        }
    }

