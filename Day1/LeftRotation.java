//Question link

/* https://www.hackerrank.com/challenges/array-left-rotation/problem */


import java.io.*;
import java.util.*;


public class LeftRotation {

   public static void main(String[] args){
       
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int d = sc.nextInt();
       int[] array =new int[n];
       int i,temp;
       for(i=0; i<n; i++){
           array[i] = sc.nextInt();
       }
       int ans[] = new int[n];
       for(i=0;i<n;i++){
           ans[(i+n-d)%n] = array[i];
           
       }
       for(i=0;i<n;i++){
           System.out.print(ans[i]+" ");
       }
       
   }
}