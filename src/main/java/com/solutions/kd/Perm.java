package com.solutions.kd;

/**
 * Created by e-kfdz on 9/21/2017.
 */
public class Perm {

    public int solution(int[] A) {
        long N = A.length;

        long sum = 0L;
        for (int i = 0; i< N;i++) {
            sum += A[i];
        }

        long correctSum = (N*(N+1))/2;

        return sum == correctSum ? 1 : 0;
    }

}
