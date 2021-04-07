package CodingBatPostCodeup;

public class CodingBat {
    /**
     * You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.
     * LOGIC 1-BLUE-TICKET
     * blueTicket(9, 1, 0) → 10
     * blueTicket(9, 2, 0) → 0
     * blueTicket(6, 1, 4) → 10
     */

    public static int blueTicket(int a, int b, int c) {
        if (a+b ==10 || b+c ==10 || c+a ==10){
            return 10;
        }
        else if ((a+b)-(b+c)==10 || (a+b) - (c+a)==10 ){
            return 5;
        }
        else {
            return 0;
        }
    }


/**Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)

 */

public static boolean shareDigit(int a, int b) {
    int firstNumberLastDigit = a%10 ;
    int firstNumberFirstDigit = a/10;
    int secondNumberFirstDigit =b%10;
    int secondNumbertSecondDigit =b/10;
    if ( firstNumberLastDigit == secondNumberFirstDigit ||
            firstNumberLastDigit ==secondNumbertSecondDigit){
        return true;
    }else if (firstNumberFirstDigit ==secondNumberFirstDigit ||
            firstNumberFirstDigit == secondNumbertSecondDigit){
        return true;
    }else {
        return false;
    }
}


    /**You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.


     greenTicket(1, 2, 3) → 0
     greenTicket(2, 2, 2) → 20
     greenTicket(1, 1, 2) → 10*/
    public static int  greenTicket(int a, int b, int c) {
        if(a==b && a==c ){
            return 20;
        }else if(a!=b && a!=c && b!=c){
            return 0;
        }
        return 10;
    }
 /**   You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0*/
 public static int redTicket(int a, int b, int c) {
     if(a==2 && b==2 && c==2){
         return 10;
     }else if(a==b && a==c){
         return 5;
     }else if(b!=a && c!=a){
         return 1;
     }else
         return 0;
 }

/**Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by 5, then the return the smaller value. However, in all cases, if the two values are the same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.

 */

    public static int maxMod5(int a, int b) {
        if (a==b ){
            return 0;
        }else if (a%5 == b%5  && a<b){
            return a;
        }else if (a%5==b%5 &&  a>b){
            return b;
        }else if (a>b){
            return a;
        }else return b;
    }


    /**Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.*/


    public static int sortaSum(int a, int b) {
        if (a+b >=10 && a+b<=19){
            return 20;
        }
        return a+b;
    }

    /**Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".s*/

    public  static String alarmClock(int day, boolean vacation) {
        if ((day == 0 && vacation ) || (day == 6 && vacation)){
            return "off";
        }else if ((day != 0 && vacation) && (day != 6 && vacation)){
            return "10:00";
        }else if ((day != 0 && !vacation ) && (day != 6 && !vacation )){
            return "7:00";
        }else if((day == 0 && !vacation) || (day ==6  && !vacation)){
            return "10:00";
        }else
            return "error";

    }
    public static void main(String[] args) {
        System.out.println(CodingBat.blueTicket(9,1,0));
        System.out.println(CodingBat.shareDigit(11,22));
        System.out.println(CodingBat.greenTicket(2,6,9));
        System.out.println(CodingBat.redTicket(22,45,67));
        System.out.println(CodingBat.maxMod5(20,10));
        System.out.println(CodingBat.sortaSum(2,5));
        System.out.println(CodingBat.alarmClock(6,false));

 }


}