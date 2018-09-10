package com.problems;

public class LightBulbsCoding {

    public int solution(int[] A) {
        int numOfBulbs = A.length;

        //Counting number of moments at which all bulbs are shine
        int moments = 0;

        //Tracking number of bulbs turned on
        int count = 0;

        //Checking if initial bulb is "1" increment moment because it always shine
        if (A[0] == 1)
            moments++;

        //Creating BulbStatus boolean array to store which bulb is turned on
        boolean[] bulbStatus = new boolean[numOfBulbs + 1];
        bulbStatus[A[0]] = true;

        // j and k are two pointers
        int j, k;

        for (j = 1; j < numOfBulbs; j++) {
            count = 0;
            bulbStatus[A[j]] = true;

            for (k = 0; k <= j; k++) {
                //Tracking number of bulbs turned on upto Kth position
                if (A[k] == 1) {
                    count++;
                    continue;
                } else if ((bulbStatus[A[k] - 1] == true))
                    count++;
            }

            //number of bulbs turned on equal to current position of j
            if (count == j + 1)
                moments++;

        }

        return moments;
    }

    public static void main(String[] args) {

        //creating object of LightBulbsCoding
        LightBulbsCoding lightBulbsCodingObj = new LightBulbsCoding();
        int[] A = {2, 1, 3, 5, 4};
        System.out.println(lightBulbsCodingObj.solution(A));
    }
}
