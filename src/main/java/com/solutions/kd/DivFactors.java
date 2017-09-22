package com.solutions.kd;

/**
 * Created by e-kfdz on 9/22/2017.
 */
public class DivFactors {

    public int solution(int N) {
        if (N == 1) {
            return 1;
        }

        int total = 2;
        int index = 2;

        for (; index < Math.sqrt(N); index++) {
            if (N % index == 0) {
                total+=2;
            }
        }

        if (N % Math.sqrt(N) == 0) {
            total++;
        }

        return total;
    }

}
