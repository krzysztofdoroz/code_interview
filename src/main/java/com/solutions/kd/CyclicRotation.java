package com.solutions.kd;

import org.apache.log4j.Logger;

/**
 * Created by e-kfdz on 9/18/2017.
 */
public class CyclicRotation {

    private final static Logger LOG = Logger.getLogger(CyclicRotation.class);

    public int[] solution(int[] A, int K) {

        if (A.length == 0) {
            return A;
        }

        for (int k = 0; k < K; k++) {
            int current = A[0];

            for (int i = 0; i < A.length; i++) {
                int replaced = A[(i + 1) % A.length];
                A[(i + 1) % A.length] = current;
                current = replaced;
            }
        }

        return A;
    }

}
