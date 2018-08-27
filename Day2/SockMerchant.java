
//Question link

/*https://www.hackerrank.com/challenges/sock-merchant/problem*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;


public class SockMerchant {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int inp=in.nextInt(),count = 0;
        
        int[] socks=new int[101];

        for(int i=0; i<inp; i++){

            int p = in.nextInt();
            
            if (socks[p]==1) {

                count++;
               socks[p]=0;

            } 

            else {
                socks[p]=1;
            }
        }

        System.out.println(count);
    }
}