package com.solutions.kd;

/**
 * Created by e-kfdz on 9/22/2017.
 */
public class PassingCars {

    public int solution(int[] A) {
        int N = A.length;

        long result = 0;
        int first = A[0];
        int carsSoFar = 1;

        for (int i = 1; i < N; i++) {
            if (A[i] == first) {
                carsSoFar++;
            } else {
                result += carsSoFar;
            }
        }

        return result > 1_000_000_000 ? -1 : Long.valueOf(result).intValue();
    }

}
