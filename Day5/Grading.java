
//Question link

/*https://www.hackerrank.com/challenges/grading/problem*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Grading {

   public static void main(String[] args){
       
       int n;
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       int[] arr = new int[n];
       
       for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
       }
       
       int r;
       for(int i=0; i<n; i++){
           if(arr[i]<38)
               System.out.println(arr[i]);
           
           else{
               r = arr[i]%5;
               if((5-r)>=3)
               System.out.println(arr[i]);
               
               else{
                   System.out.println(arr[i]+5-r);
               }
           }
       }
   }
}