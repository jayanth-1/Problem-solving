import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class FileStatistics {

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		 HashSet<String> music = new HashSet<String>();
		 HashSet<String> image = new HashSet<String>();
		 HashSet<String> movie = new HashSet<String>();
         
         music.add("mp3");
         music.add("aac");
         music.add("flac");
         image.add("jpg");
         image.add("bmp");
         image.add("gif");
         movie.add("mp4");
         movie.add("avi");
         movie.add("mkv");
         int sizeMusic=0,sizeImage=0,sizeMovie=0,sizeOther=0;
		while(sc.hasNextLine()){
          String a=sc.nextLine();
     

		  String[] tokens= a.split(" ");
		  int l=tokens[0].length();
		  String exten="";
		  StringBuilder ext = new StringBuilder();
		  l=l-1;
           
		  while(tokens[0].charAt(l)!='.'){
		  	exten+=tokens[0].charAt(l);
		  	l--;
		  }
		  
          
		  ext.append(exten);
		  ext=ext.reverse();
            String ex=ext.toString();
            int lb=tokens[1].length();
            
            int n1=a.length()-1;
            char c=a.charAt(n1);

            if(c!='"'){
            if(music.contains(ex))
            	sizeMusic+=Integer.parseInt(tokens[1].substring(0,lb-1));
            else if(image.contains(ex))
            	sizeImage+=Integer.parseInt(tokens[1].substring(0,lb-1));
            else if(movie.contains(ex))
            	sizeMovie+=Integer.parseInt(tokens[1].substring(0,lb-1));
            else
            	sizeOther+=Integer.parseInt(tokens[1].substring(0,lb-1));
            }

            else{
            	   if(music.contains(ex))
            	sizeMusic+=Integer.parseInt(tokens[1].substring(0,lb-2));
            else if(image.contains(ex))
            	sizeImage+=Integer.parseInt(tokens[1].substring(0,lb-2));
            else if(movie.contains(ex))
            	sizeMovie+=Integer.parseInt(tokens[1].substring(0,lb-2));
            else
            	sizeOther+=Integer.parseInt(tokens[1].substring(0,lb-2));
            }
            
            
            if(c=='"')
            	break;

           
		  }

		   String strMusic=String.valueOf(sizeMusic);
           String strImage=String.valueOf(sizeImage);
           String strMovie=String.valueOf(sizeMovie);
           String strOther=String.valueOf(sizeOther);

           String ans="\nmusic "+strMusic+"b" +"\n"+"images "+strImage +"b"+"\n"+"movie "+strMovie+"b"+"\n"+"other "+strOther+"b";

           System.out.println(ans);
           
		}
		
		
	}
