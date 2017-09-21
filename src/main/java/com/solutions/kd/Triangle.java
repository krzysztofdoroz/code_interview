package com.solutions.kd;

import java.util.Arrays;

/**
 * Created by e-kfdz on 9/19/2017.
 */
public class Triangle {

    public int solution(int[] A) {
        if (A.length < 3) {
            return 0;
        }

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                for (int k = j + 1; k < A.length; k++) {
                    if ((A[i] + A[j] > A[k]) && (A[i] + A[k] > A[j]) &&(A[k] + A[j] > A[i])) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

}
