package com.solutions.kd;

/**
 * Created by e-kfdz on 9/18/2017.
 */
public class MissingElem {

    public int solution(int[] A) {
        long N = A.length;

        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }

        long totalSum = ((N + 1) * (N + 2))/2;

        return Long.valueOf(totalSum - sum).intValue();
    }

}
