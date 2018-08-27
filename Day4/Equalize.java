
//Question link

/*https://www.hackerrank.com/challenges/equality-in-a-array/problem*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Equalize {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[101];
        int maxFrequency = 0;
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[num]++;
            if (arr[num] > arr[maxFrequency]) 
                maxFrequency = num;  
        }
        
        int count = 0;
        for (int i = 0; i < 101; i++) {
            if (i != maxFrequency) 
                count += arr[i];
        }
        System.out.println(count);
    }
}