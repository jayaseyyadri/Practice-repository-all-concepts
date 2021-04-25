package mooc;

import java.util.Scanner;

public class GradesAndPoints {

import java.util.Scanner;


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Give points[0-100]");
            int userGrade = Integer.valueOf(scan.nextLine());
            if (userGrade < 0) {
                System.out.println("Grade:impossible!");
            } else if (userGrade >= 0 && userGrade <= 49) {
                System.out.println("Grade:failed");
            } else if (userGrade >= 50 && userGrade <= 59) {
                System.out.println("Grade:1");
            } else if (userGrade >= 60 && userGrade <= 69) {
                System.out.println("Grade:2");
            } else if (userGrade >= 7 && userGrade <= 79) {
                System.out.println("Grade:3");
            } else if (userGrade >= 80 && userGrade <= 89) {
                System.out.println("Grade:4");
            } else if (userGrade >= 90 && userGrade <= 100) {
                System.out.println("Grade:5");
            } else {
                System.out.println("Grade:incredible!");
            }
        }
    }

}
