package com.solutions.kd;

import java.util.Arrays;

/**
 * Created by e-kfdz on 9/22/2017.
 */
public class DistinctVals {

    public int solution(int[] A) {
        int N = A.length;

        if (N == 0) {
            return 0;
        }

        Arrays.sort(A);

        int total = 1;
        int lastEl = A[0];

        for (int i = 1; i < N; i++) {
            if (lastEl == A[i]) {
                // do nothing
            } else {
                lastEl = A[i];
                total++;
            }
        }

        return total;
    }

}
