package com.solutions.kd;

/**
 * Created by e-kfdz on 9/19/2017.
 */
public class MissingInt {

    public int solution(int[] A) {
        int N = A.length;
        int MAX = 1_000_000;

        int[] counters = new int[MAX];

        for (int i = 0; i < N; i++) {
            if (A[i] > 0) {
                counters[A[i]]++;
            }
        }

        for(int i = 1; i < MAX; i++) {
            if(counters[i] == 0) {
                return i;
            }
        }

        return 1;
    }

}
