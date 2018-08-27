
//Question link

/*https://www.hackerrank.com/challenges/sparse-arrays/problem*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;


public class SparseArrays {

    public static void main(String[] args){
        
        int str,quer;
        
        Scanner sc = new Scanner(System.in);
        str = sc.nextInt();
        String[] strings = new String[str];
        int i,j,count;
        for(i=0;i<str;i++)
            strings[i] = sc.next();
        quer = sc.nextInt();
        int[] frequency = new int[quer];
        String[] queries = new String[quer];
        for(i=0;i<quer;i++)
            queries[i] = sc.next();
        
        for( j=0; j<quer; j++)
        {
            count = 0;
        for(i=0; i<str; i++){
            if(strings[i].equals(queries[j]))
                count++;
        }
        frequency[j] = count;
    }
        for(i=0;i<quer;i++)
          System.out.println(frequency[i]);
    
    }
}
    