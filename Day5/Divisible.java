
//Question link

/*https://www.hackerrank.com/challenges/divisible-sum-pairs/problem*/

// Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {

         int l = ar.length;
        int count = 0;
        for(int i =0; i<l; i++){
            
            for(int j=i+1; j<l; j++){
                if(((ar[i] + ar[j])%k) == 0)
                    count++;
            }
        }
        
        return count;

    }