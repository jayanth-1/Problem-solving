
//Question link

/*https://www.hackerrank.com/challenges/cats-and-a-mouse/problem*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CatMouse {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int c1,c2,m,t;
        t = sc.nextInt();
        
        for(int i=0;i<t; i++){
        c1 = sc.nextInt();
        c2 = sc.nextInt();
        m = sc.nextInt();
        int d1 = Math.abs(c1 - m);
        int d2 = Math.abs(c2 - m);
        
        if(d1<d2)
            System.out.println("Cat A");
        else if(d1>d2){
            System.out.println("Cat B");
        }
        
        else{
            System.out.println("Mouse C");
        }
    }
    }
}