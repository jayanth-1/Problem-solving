class Solution{

	public void solution(int[] A,int K){

		String ans="";
        
        int n=A.length;
        
        int[] digLen=new int[n];

        for(int i=0;i<n;i++){
            String temp=Integer.toString(A[i]);
            digLen[i]=temp.length();
        }

       int max=0;
       for(int i=0;i<n;i++)
         max=Math.max(max,digLen[i]);
       
       String top="";

        int top_length;
        if(n/K>0)
            top_length=K;
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

         for(int i=0;i<K && (count<n);i++){
           String temp2=Integer.toString(A[count]);
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

    int bottom_length=n%K;
    if(bottom_length==0)
    bottom_length=K;
    String bottom="";
    for(int i=0;i<bottom_length;i++){
        bottom+="+";
        for(int j=0;j<max;j++){
            bottom+="-";
        }
    }
    bottom+="+";
    ans=ans+bottom;
    
    System.out.println(ans);
    }

}
	
