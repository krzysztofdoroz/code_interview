package com.solutions.kd;

/**
 * Created by e-kfdz on 9/21/2017.
 */
public class Demo {

    public int solution(int[] A) {
        int N = A.length;

        int[] counts = new int[N+1];

        for (int i = 0; i< N ; i++){
            if (A[i] >=0 && A[i] <= N) {
                counts[A[i]]++;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (counts[i] == 0) {
                return i;
            }
        }

        return N + 1;
    }

}
