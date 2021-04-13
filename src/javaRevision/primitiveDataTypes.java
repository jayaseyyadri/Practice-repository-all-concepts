package javaRevision;

public class primitiveDataTypes {
    public static void main(String[] args) {


        int myInt = 10000;
        int myIntMax = Integer.MAX_VALUE;
        int myIntMin = Integer.MIN_VALUE;
        int overMyIntMax = myIntMax + 1;
        int underMyIntMin = myIntMin - 1;

        System.out.println("Max Value of an int: "+myIntMax);
        System.out.println(overMyIntMax + "it is known as overflow");
        System.out.println("Min value of an int: "+ myIntMin);
        System.out.println(underMyIntMin+"it is known as underflow");
        //if input number as a literal java will throw a compile time error i.e will err out before running
        //Default data type for whole number is assumed as int and double



 /**Type Casting-->converting 1 datatype to another
  *  to cast
  *         byte = (byte)myInt/2;
  *         short =(short)50/2;
  */

/**WIDTH
 *
 * byte -> 8 bits --Default
 * short->16 bits
 * int  ->32 bits
 * long ->64 bits
 * double->64 bits(more precision)
 * float -32 bits
 * */



    }
}
