class Solution{

	public int solution(int[] A){

		int n;
		
		n=A.length;
		
        int mom=0,count=0;
		
		if(A[0]==1)
        	mom++;
		
		int[] hash=new int[n+1];
		hash[A[0]]=1;int j,k;
		for(j=1;j<n;j++)
		{
			count=0;
			hash[A[j]]=1;
			for(k=0;k<=j;k++){

				if(A[k]==1){
					count++;
					continue;
				} 
				else if((hash[A[k]-1]==1))
					count++;

			} 
			if(count== j+1)
				mom++;

		}

		return mom;
	}
	
}

	