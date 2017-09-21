package com.solutions.kd;

import java.util.Arrays;

/**
 * Created by e-kfdz on 9/21/2017.
 */
public class MinAbsSum {

    public int solution(int[] A) {
        int N = A.length;
        Arrays.sort(A);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i< N; i++) {
            min = Math.min(min, Math.abs(A[i] + A[i]));

            int negativeVal = -1 * A[i];
            int index = Arrays.binarySearch(A, negativeVal);

            if (index > 0) {
                return 0;
            } else {
                index = index * -1;

                if (index < N && index >=0){
                    min = Math.min(min, Math.abs(A[index] + A[i]));
                }

                if (index + 1 < N && index + 1 >=0){
                    min = Math.min(min, Math.abs(A[index + 1] + A[i]));
                }

                if (index - 1 < N && index - 1 >=0){
                    min = Math.min(min, Math.abs(A[index - 1] + A[i]));
                }

            }

        }

        return min;
    }


}
