package HackerRank;

import java.io.*;
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


        public static void main(String[] args){
//            System.out.println(hackerRank.sockMerchant(102[5,[6,7,2,3,4,5,5]));
        }
        }



