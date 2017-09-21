package com.solutions.kd;

import java.math.BigDecimal;

/**
 * Created by e-kfdz on 9/20/2017.
 */
public class Ladder {

    public int[] solution(int[] A, int[] B) {
        int N = A.length;

        int[] result = new int[N];

        for (int i = 0; i< N; i++) {
            result[i] = (fib(A[i]).remainder(BigDecimal.valueOf(Math.pow(2,B[i])))).intValue();
        }

        return result;
    }

    private BigDecimal fib(int N) {
        BigDecimal a = BigDecimal.ONE;
        BigDecimal b = BigDecimal.ONE;

        if (N == 0) {
            return a;
        } else if (N == 1) {
            return b;
        }

        for (int i=2;i<=N;i++) {
            BigDecimal c = a.add(b);
            a = b;
            b = c;
        }
        return b;
    }

}
