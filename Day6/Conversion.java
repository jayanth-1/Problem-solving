
//Question link

/*https://www.hackerrank.com/challenges/time-conversion/problem*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args){
        String s;
        Scanner sc = new Scanner(System.in);
        
        s = sc.next();
          String[] arr = s.split(":");
        int p;
        if(arr[2].contains("AM")){
            if(arr[0].equals("12")){
                arr[0] = "00";
            }
            String str = arr[2].substring(0,2);
            System.out.println(arr[0]+ ":" + arr[1] + ":" +str);
        }
        
        else{
            p = Integer.parseInt(arr[0]);
            if(p!=12)
              p = p+12;
            String str1 = arr[2].substring(0,2);
            System.out.println(p+ ":" + arr[1] + ":" +str1);
        }
           
    }

}