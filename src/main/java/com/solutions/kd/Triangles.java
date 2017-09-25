package com.solutions.kd;

import java.util.Arrays;

/**
 * Created by e-kfdz on 9/25/2017.
 */
public class Triangles {

    public int solution(int[] A) {
        int N = A.length;

        if (N < 3) {
            return 0;
        }

        Arrays.sort(A);

        int total = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N && A[i] + A[j] > A[k]; k++) {
                    if (A[i] + A[j] > A[k] && A[i] + A[k] > A[j] && A[j] + A[k] > A[i]) {
                        //System.out.println("i:" + A[i] + " j:" + A[j] + " k:" + A[k]);
                        total++;
                    }
                }
            }
        }

        return total;
    }

}
