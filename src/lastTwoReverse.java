public class lastTwoReverse {
    public static void main(String[] args) {

        System.out.println( lastTwo("cody"));

    }

        /**  Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
         lastTwo("coding") → "codign"
         lastTwo("cat") → "cta"
          lastTwo("ab") → "ba"**/


        public static String lastTwo (String str){
            String full = "";
            if (str == "" || str.length() <= 1) {
                return str;
            }
            String word = str.substring(0, str.length() - 2);
            String last = str.substring(str.length() - 1);
            String secondLast = str.substring(str.length() - 2, str.length() - 1);
            if (str.length() >= 2) {
                full = word + last + secondLast;
            }
            return full;
        }
    }
