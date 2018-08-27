
//Question link

/*https://www.hackerrank.com/challenges/day-of-the-programmer/problem*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;


public class DayOfTheProgrammer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if(year == 1918) {
            System.out.println("26.09.1918");
        } 

        else {

            if(year < 1918 && year % 4 == 0) {
                System.out.println("12.09." + year);    
            } 

            else if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("12.09." + year);    
            } 
            else {
                
                System.out.println("13.09." + year);        
            }  
        }
    }

    }
