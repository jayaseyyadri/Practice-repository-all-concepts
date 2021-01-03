package practiceJava;

public class ReverseString {

    //Reverse a string

    public String reverse(String inputString) {
        if (inputString == null) {
            return inputString;
        }
        String bucket = "";
        for (int i = 0; i < inputString.length(); i++) {
            bucket = inputString.charAt(i) + bucket;
        }
        return bucket;

    }

    public static void main(String[] args) {
        ReverseString a = new ReverseString();
        System.out.println(a.reverse("hellothere"));
    }
}