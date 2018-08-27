
//Question link

/*https://www.hackerrank.com/challenges/kangaroo/problem*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

 class Kangaroo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1,v1,x2,v2;
        x1 = sc.nextInt();
        v1 = sc.nextInt();
        x2 = sc.nextInt();
        v2 = sc.nextInt();
        
        boolean answer = false;
        while (true) {
            if (x1 == x2) {
               answer = true;
                break;
            }
            
            if ((v1>=v2 && x1 > x2) || (v2>=v1 && x2 > x1)) {
                break;
            }
            x1 = x1+v1;
            x2 = x2+v2;
        }
        if (answer) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}