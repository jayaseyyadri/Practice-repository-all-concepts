//package practiceJava;
//
//public class ArmstrongNumbers {
//    // 153
//
//   public boolean arm(int numberToCheck) {
//       int currentNumber = numberToCheck;
//       int digitCube;
//       int reminder;
//       int sum = 0;
//
//       do {
//           reminder = numberToCheck % 10;
//           digitCube = (int) Math.pow(reminder, 3);
//           currentNumber = numberToCheck / 10;
//           sum += digitCube;
//       } while (numberToCheck != 0) ;
//
//           if (sum == currentNumber) {
//               System.out.println("is Arm ");
//               return true;
//           }else{
//               System.out.println("is not arm");
//               return false;
//           }
//
//
//   }
//    public static void main(String[] args) {
//        ArmstrongNumbers a = new ArmstrongNumbers();
//            System.out.println(a.arm(153));
//    }
//}
