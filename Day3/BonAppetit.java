
//Question link

/*https://www.hackerrank.com/challenges/bon-appetit/problem*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BonAppetit {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int decline=sc.nextInt();
        int bill=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(i!=decline)
                bill=bill+arr[i];
        }
        int charged=sc.nextInt();
        if(charged==bill/2)
            System.out.println("Bon Appetit");
        else
            System.out.println(charged-bill/2);
 }
}