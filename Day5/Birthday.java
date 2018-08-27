
//Question link

/*https://www.hackerrank.com/challenges/birthday-cake-candles/problem*/

// Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        
        int n = ar.length;
        int max = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        
        for(int i=0;i<n; i++){
            
            if(ar[i] > max){
                max = ar[i];
            }
             if(h.containsKey(ar[i])){
                h.put(ar[i],h.get(ar[i])+1);
            }
            else
                h.put(ar[i],1);
        }

        return h.get(max);
    }
