package com.solutions.kd;

/**
 * Created by e-kfdz on 9/25/2017.
 */
public class Ropes {

    public int solution(int K, int[] A) {
        int N = A.length;
        int total = 0;
        long currentRope = 0;

        for (int i =0; i< N; i++) {
            if (A[i] >= K) {
                currentRope = 0;
                total++;
            } else {
                currentRope += A[i];
                if (currentRope >= K) {
                    currentRope = 0;
                    total++;
                }
            }
        }

        return total;
    }

}
