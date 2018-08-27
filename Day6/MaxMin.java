
//Question link

/*https://www.hackerrank.com/challenges/angry-children/problem*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxMin {

    public static void main(String[] args) {
        int n, k;
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = 1000000000,tmp;
        k--;
        for(int i = 0; i < n && k < n; i++, k++){
            tmp = arr[k] - arr[i];
            if(tmp < ans){
                ans = tmp;
            }
        }
        
        System.out.println(ans);
    }
}