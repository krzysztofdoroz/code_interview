package com.solutions.kd;

/**
 * Created by e-kfdz on 9/22/2017.
 */
public class Stocks {

    public int solution(int[] A) {
        int N = A.length;

        if (N < 2) {
            return 0;
        }

        int min = A[0];

        int max = 0;
        for (int i = 1; i < N; i++) {
            max = Math.max(max, A[i] - min);
            min = Math.min(min, A[i]);
        }

        return max;
    }

}
