class Solution {

	public String solution(String s){

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
          return ans2;
          
        }
        
        else if(r==0)
        	return ans.substring(0,l-1);

		else
			return ans;
		  
        }

	}

	
