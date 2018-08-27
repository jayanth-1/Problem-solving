
//Question link

/*https://www.hackerrank.com/challenges/counting-valleys/problem*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class CountValleys {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String hike = in.next();
        int seaLevel = 0;
        int countValley = 0;
        boolean underSea = false;
        int l = hike.length();
        for(int i = 0; i <l ; i++){
            if(seaLevel == 0 && underSea == true){
                underSea = false;
                
            } 
            else if(seaLevel < 0 && underSea == false){
                underSea = true;
                countValley++;
             }
            
            if(hike.charAt(i) == 'U' ){
                seaLevel++;
            }
            else if(hike.charAt(i) == 'D'){
                seaLevel--;
            }
      }
        
        System.out.println(countValley);
    }
}