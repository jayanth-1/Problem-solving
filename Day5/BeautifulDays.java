
//Question link

/*https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

 class BeautifulDays {

    static int reverse(int r){
        int temp = r;
        int ans = 0;
        while(temp>0){
            int rem = temp%10;
            ans = ans*10 + rem;
            temp/=10;
        }
        
        return ans;
    }
    static int beautifulDays(int i, int j, int k) {

          int p,q;
        int count = 0;
        for(p=i; p<=j; p++){
            int diff = Math.abs(p - reverse(p));
            if((diff%k)==0)
                count++;
        }
        
        return count;
    }

   
    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        int result = beautifulDays(i, j, k);

        System.out.println(result);

        
    }
}
