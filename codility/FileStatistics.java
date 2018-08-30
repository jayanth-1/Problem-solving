class Solution {

	public String solution(String s){


		Scanner sc=new Scanner(s);

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
         Long sizeMusic=0L,sizeImage=0L,sizeMovie=0L,sizeOther=0L;
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
            	sizeMusic+=Long.parseLong(tokens[1].substring(0,lb-1));
            else if(image.contains(ex))
            	sizeImage+=Long.parseLong(tokens[1].substring(0,lb-1));
            else if(movie.contains(ex))
            	sizeMovie+=Long.parseLong(tokens[1].substring(0,lb-1));
            else
            	sizeOther+=Long.parseLong(tokens[1].substring(0,lb-1));
            }

            else{
            	   if(music.contains(ex))
            	sizeMusic+=Long.parseLong(tokens[1].substring(0,lb-2));
            else if(image.contains(ex))
            	sizeImage+=Long.parseLong(tokens[1].substring(0,lb-2));
            else if(movie.contains(ex))
            	sizeMovie+=Long.parseLong(tokens[1].substring(0,lb-2));
            else
            	sizeOther+=Long.parseLong(tokens[1].substring(0,lb-2));
            }
            
            
            if(c=='"')
            	break;

           
		  }

		   String strMusic=Long.toString(sizeMusic);
           String strImage=Long.toString(sizeImage);
           String strMovie=Long.toString(sizeMovie);
           String strOther=Long.toString(sizeOther);

           String ans="\"music "+strMusic+"b" +"\n"+"images "+strImage +"b"+"\n"+"movie "+strMovie+"b"+"\n"+"other "+strOther+"b\"";

           return ans;
           
		}
		
		
	}

	
