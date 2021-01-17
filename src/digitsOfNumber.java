public class digitsOfNumber {

    public static void main(String[] args) {

       int count=0;
        int number1 = 2078880;
        while (number1 != 0) {
            number1=number1 / 10;
            count++;
            System.out.println(number1);
            System.out.println(count);
        }
    }
}