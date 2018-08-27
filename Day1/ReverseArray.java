//Question link

/* https://www.hackerrank.com/challenges/arrays-ds/problem*/

import java.io.*;
import java.util.*;

public class ReverseArray {

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] intArray = new int[n];
        int i,input;
        for(i=0; i<n; i++){
            intArray[i] = sc.nextInt();
        }
        
        int start = 0,end = n-1;
        while(start < end){                    // reversing array by swaping elements
            int temp = intArray[start];
            intArray[start] = intArray[end];
            intArray[end] = temp;
            start++;
            end--;
        }
        for(i=0;i<n;i++){
            System.out.print(intArray[i]+" ");
        }
        
    }
        
}