package com.solutions.kd;

/**
 * Created by e-kfdz on 9/21/2017.
 */
public class Counter {

    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];

        int lastMax = 0;
        int localMax = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                lastMax = localMax;
            } else {
                if (counters[A[i] -1] < lastMax) {
                    counters[A[i] -1] = lastMax;
                }
                counters[A[i] - 1]++;
                localMax = Math.max(localMax, counters[A[i] - 1]);
            }
        }

        for (int i =0; i<N; i++) {
            if (counters[i] < lastMax) {
                counters[i] = lastMax;
            }
        }

        return counters;
    }

}
