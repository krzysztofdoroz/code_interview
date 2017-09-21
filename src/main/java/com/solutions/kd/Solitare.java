package com.solutions.kd;

/**
 * Created by e-kfdz on 9/21/2017.
 */
public class Solitare {

    public int solution(int[] A) {
        int N = A.length;

        for(int i = 1; i< N; i++){
            int max = Integer.MIN_VALUE;
            for (int j = 6; j > 0; j--) {
                if (i - j >= 0) {
                    max = Math.max(max, A[i - j] + A[i]);
                }
            }
            A[i] = max;
        }

        return A[N - 1];
    }

}
