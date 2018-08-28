import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class PhoneNumber {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		int n=s.length();
        String ans2;
		int i,count=0;;
		String ans="";
		int numCount=0;
		for(i=0;i<n;i++){
			if(s.charAt(i)==' ' || s.charAt(i)=='/' || s.charAt(i)=='-')
				continue;
			else
				numCount++;
		}
        
        int r=numCount%3;
		for(i=0;i<n;i++){

			if(s.charAt(i)==' ' || s.charAt(i)=='/' || s.charAt(i)=='-')
				continue;

            ans+=s.charAt(i);

			count++;
            if(count==3){
			ans+="-";
			count=0;

		}

		}
         char a,b;int l=ans.length();
        if(r==1 && numCount>2){
          a=ans.charAt(l-1);
          b=ans.charAt(l-3);
          ans2=ans.substring(0,l-3)+'-'+b+a;
          System.out.println(ans2);
        }
        
        else if(r==0)
		  System.out.println(ans.substring(0,l-1));

		else
		  System.out.println(ans);
        }
	}
