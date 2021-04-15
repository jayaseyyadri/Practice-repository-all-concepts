package HackerRank;

import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class hackerRank {
/**There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

 for eg: There is 1 pair of color 1 & one of color 2 and three socks left, one of each color. The number of pairs would be 2
Constraints:
   1<=n<=100
    1<ar[i]<=100 where 0<= i<=n **/

        static int sockMerchant(int n, int[] ar) {
            //find pairs if pair found increment count
            HashSet<Integer> sockPair = new HashSet<Integer>();
            int counter = 0;
            for(int i =0;i< n ;i++){
                if(sockPair.contains(ar[i])){
                    sockPair.remove(ar[i]);
                    counter++;
                }else {
                    sockPair.add(ar[i]);
                }
            }
            return counter;
        }
    /**A teacher asks the class to open their books to a page number. A student can either start turning pages from the front of the book or from the back of the book. They always turn pages one at a time. When they open the book, page 1 is always on the right side:
     * When they flip page 1 they see pages 2 and 3 Each page except the last page will always be printed on both sides. The last page may only be printed on the front, given the length of the book. If the book is  pages long, and a student wants to turn to page p what is the minimum number of pages to turn? They can start at the beginning or the end of the book.
     *
     * Given n and p find and print the minimum number of pages that must be turned in order to arrive at page p.
     *
     * */
    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
        int totalPageCount = n / 2;
        int pageCountFromFront = p / 2;
        int pageCountFromBack = totalPageCount - pageCountFromFront;
        return Math.min(pageCountFromFront, pageCountFromBack);
    }
        public static void main(String[] args){
           int[] ar = new int []{1,2,6,7,7};

  System.out.println(hackerRank.sockMerchant(5,ar));
            System.out.println(hackerRank.pageCount(8,7));
        }
        }



