package com.solutions.kd;

import java.util.Arrays;

/**
 * Created by e-kfdz on 9/19/2017.
 */
public class TripletProduct {

    public int solution(int[] A) {
        int N = A.length;

        Arrays.sort(A);

        // 1st case a < 0, b < 0, c > 0
        long first = A[0] * A[1] * A[N - 1];
        long second = A[N-1] * A[N-2] * A[N-3];


        return Long.valueOf(Math.max(first, second)).intValue();
    }

}
