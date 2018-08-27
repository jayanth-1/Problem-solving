
//Question link

/*https://www.hackerrank.com/challenges/find-digits/problem*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FindDigits {

    public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
    int i,digit,dividend,count,n;
        for(i=0;i<t;i++) {
             n = sc.nextInt();
             dividend = n;
             count = 0;
            while(dividend > 0) {
               digit = dividend % 10;
                if(digit > 0 && n % digit == 0)
                    count++;
                dividend /= 10;
            }
            System.out.println(count);
        }
    }
}
    