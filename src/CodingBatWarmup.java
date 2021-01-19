public class CodingBatWarmup {
//    Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.

    public static boolean in3050(int a, int b) {
        if((a>=30 && a<=40) &&
                (b>=30 && b<=40)){
            return true;
        }else if((a>=40 && a<=50)&&
                (b>=40 && b<=50)){
            return true;
        }
        return false;
    }




//    Return true if the given string contains between 1 and 3 'e' chars.
//
//            stringE("Hello") → true
//    stringE("Heelle") → true
//    stringE("Heelele") → false

    public static  boolean stringE(String str) {
        if (str ==""){
            return false;
        }

        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                count = count+1;
            }
        }
        if(count > 0 && count <=3){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("in  range ?"+in3050(30,31));
        System.out.println("CONTAINE SSEQUENCE?"+stringE("HAHAHAHE"));
    }

}
