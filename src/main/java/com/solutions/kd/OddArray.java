package com.solutions.kd;

import org.apache.log4j.Logger;

/**
 * Created by e-kfdz on 9/18/2017.
 */
public class OddArray {

    private final static Logger LOG = Logger.getLogger(OddArray.class);

    public int solution(int[] A) {
        if (A.length == 1) {
            return A[0];
        }

        int result = A[0];

        for (int i = 1; i < A.length; i++) {
            result ^= A[i];
        }

        return result;
    }

}
