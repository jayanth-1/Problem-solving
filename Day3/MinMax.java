
//Question link

/*https://www.hackerrank.com/challenges/mini-max-sum/problem*/
// Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
 
        int min = arr[0],max = 0;
        long sum = 0; 
        for(int i = 0;i<5; i++){
            
            sum = sum + arr[i];
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }
        
        System.out.println((sum-max) + " " + (sum-min));

    }