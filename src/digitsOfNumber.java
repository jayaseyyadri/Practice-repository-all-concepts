public class digitsOfNumber {

    public static void main(String[] args) {

       int count=0;
        int number1 = 2078880;
        while (number1 != 0) {
            number1=number1 / 10;
            count++;
            System.out.println(number1);
            System.out.println(count);


     /**   ¨Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
//
//
//middleThree("Candy") → "and"
//middleThree("and") → "and"
//middleThree("solving") → "lvi"

            public String middleThree(String str) {
                String a = "";
                int middle =str.length()/2-1;
                return str.substring(middle,middle+3);

            }
    }
}