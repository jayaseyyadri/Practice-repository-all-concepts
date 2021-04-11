package javaRevision;

import java.sql.SQLOutput;

public class primitiveDataTypes {
    public static void main(String[] args) {


        int myInt = 10000;
        int myIntMax = Integer.MAX_VALUE;
        int myIntMin = Integer.MIN_VALUE;
        int overMyIntMax = myIntMax + 1;
        int underMyIntMin = myIntMin - 1;
        System.out.println("Max Value of an int: "+myIntMax);
        System.out.println(overMyIntMax + "it is known as overcasting");
        System.out.println("Min value of an int: "+ myIntMin);
        System.out.println(underMyIntMin+"it is known as undercasting");
    }
}
