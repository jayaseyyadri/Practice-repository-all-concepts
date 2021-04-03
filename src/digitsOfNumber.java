//import java.util.Scanner;
//
//public class digitsOfNumber {
//
//    public static void main(String[] args) {
//
////        int count = 0;
////        int number1 = 2078880;
////        while (number1 != 0) {
////            number1 = number1 / 10;
////            count++;
////            System.out.println(number1);
////            System.out.println(count);
////        }
//        System.out.println(sumOfDigits());
//    }
//  /**Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3
//
//
//    middleThree("Candy") → "and"
//    middleThree("and") → "and"
//    middleThree("solving") → "lvi"
//
//            **/
//
////  public String middleThree(String str) {
////      String a = "";
////      int middle =str.length()/2-1;
////      return str.substring(middle,middle+3);
////
////  }
////
//
////  Sum of fifgits of number
//
//    public static int sumOfDigits(){
//        int lastDigit ;
//        int remainingDigit;
//        int sum =0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number to find the sum of its digits");
//          int userInput= sc.nextInt();
//           while(userInput >0) {
//               lastDigit = userInput % 10;
//               sum = lastDigit + sum;
//               userInput = userInput / 10;
//           }
//            return sum;
//        }
//
//
//        //Area of hexagon
//
//    public int areaHexagon(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a side of the hexagon");
//        int side=sc.nextInt();
//
//      double cubeRoot= Math.round( Math.pow(side,1.0/3.0));
//      double area =(side);
//    }
//}