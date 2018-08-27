
//Question link

/* https://www.hackerrank.com/challenges/the-hurdle-race/problem*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HurdleRace {

    public static void main(String[] args){
        
        int n,k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int[] input = new int[n];
        int i;
        
        for(i=0;i<n;i++){
            input[i] = sc.nextInt();
        }
     
        int max = 0;
        for(i=0; i<n; i++){
            if(input[i]>max)
                max = input[i];
        }
        
        int potion = max - k;
        
        if(potion > 0)
        System.out.println(potion);
        
        else
            System.out.println(0);
            
    }
    }
