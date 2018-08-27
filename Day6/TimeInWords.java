
//Question link

/*https://www.hackerrank.com/challenges/the-time-in-words/problem*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TimeInWords {

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        String[] hours = {"one","two","three", "four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three", "twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"};
       Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        if(minute==0){
            System.out.println(hours[hour-1]+" o' clock");
        }
        if(minute==30){
            System.out.println("half past "+hours[hour-1]);
        }
        if(minute==15){
            System.out.println("quarter past "+hours[hour-1]);
        }
        if(minute==45){
            System.out.println("quarter to "+hours[hour%12]);
        }
        if(minute<30 && minute!=15 && minute!=0){
            
                System.out.println(hours[minute-1]+" minutes past "+hours[hour-1]);
            }
        if(minute>30 && minute!=45 && minute!=0){
            System.out.println(hours[60-minute-1]+" minutes to "+hours[hour]);
        }
       
    }
}