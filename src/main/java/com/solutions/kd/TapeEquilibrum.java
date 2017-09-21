package com.solutions.kd;

/**
 * Created by e-kfdz on 9/18/2017.
 */
public class TapeEquilibrum {

    public int solution(int[] A) {
        int totalSum = 0;

        for (int i = 0; i< A.length; i++){
            totalSum += A[i];
        }

        int left = 0;
        int right = totalSum;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < A.length - 1; i++){
            left += A[i];
            right -= A[i];
            if (Math.abs(left - right) < min) {
                min = Math.abs(left - right);
            }
        }

        return min;
    }

}
