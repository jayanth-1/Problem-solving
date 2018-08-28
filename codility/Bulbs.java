
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Bulbs{

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[n];
        int mom=0,count=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		if(arr[0]==1)
        	mom++;
		
		int[] hash=new int[n+1];
		hash[arr[0]]=1;int j,k;
		for(j=1;j<n;j++)
		{
			count=0;
			hash[arr[j]]=1;
			for(k=0;k<=j;k++){

				if(arr[k]==1){
					count++;
					continue;
				} 
				else if((hash[arr[k]-1]==1))
					count++;

			} 
			if(count== j+1)
				mom++;

		}

		System.out.println(mom);
	}
	
}
