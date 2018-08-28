import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class FormatArray {
  
    public static void main(String[] args){

        String ans="";
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int k=sc.nextInt();

        int[] digLen=new int[n];

        for(int i=0;i<n;i++){
            String temp=Integer.toString(arr[i]);
            digLen[i]=temp.length();
        }

       int max=0;
       for(int i=0;i<n;i++)
         max=Math.max(max,digLen[i]);
       
       String top="";

        int top_length;
        if(n/k>0)
            top_length=k;
        else
            top_length=n;

        for(int i=0;i<top_length;i++){
           top+="+";
           for(int j=0;j<max;j++)
            top+="-";
       }
       top+="+";

       int count=0;
       ans=ans+top+"\n";
       while(count<n){
             String row="|";

         for(int i=0;i<k && (count<n);i++){
           String temp2=Integer.toString(arr[count]);
           int l=temp2.length();
          
           String temp3="";
           for(int j=0;j<(max-l);j++)
              temp3+=" ";
            temp3+=(temp2+"|");
            row=row+temp3;
             count++;
          }
          
          if(count<n)
    ans=ans+row+"\n"+top+"\n";
          else
    ans=ans+row+"\n";
         
    }

    int bottom_length=n%k;
    if(bottom_length==0)
    bottom_length=k;
    String bottom="";
    for(int i=0;i<bottom_length;i++){
        bottom+="+";
        for(int j=0;j<max;j++){
            bottom+="-";
        }
    }
    bottom+="+\n";
    ans=ans+bottom;
    
    System.out.println(ans);
    }
}