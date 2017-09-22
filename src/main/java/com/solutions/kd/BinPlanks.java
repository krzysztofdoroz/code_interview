package com.solutions.kd;

/**
 * Created by e-kfdz on 9/22/2017.
 */
public class BinPlanks {

    public int solution(int[] A, int[] B, int[] C) {
        int N = A.length;

        int lastPlank = 0;
        int nail = -1;

        for (int i = 0; i < C.length; i++) {

            while (lastPlank < N && A[lastPlank] <= C[i] && C[i] <= B[lastPlank]) {
                lastPlank++;
                nail = i + 1;
            }

            if (lastPlank == N) {
                return nail;
            }
        }

        return nail;
    }

}
