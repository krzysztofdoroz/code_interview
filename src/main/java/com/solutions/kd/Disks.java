package com.solutions.kd;

/**
 * Created by e-kfdz on 9/19/2017.
 */
public class Disks {

    public int solution(int[] A) {
        int N = A.length;

        int total = 0;

        for (int i = 0; i < N; i++){
            for (int j = i + 1; j < N; j++){
                long r1r2 = (long)A[i] + (long)A[j];
                if (j - i <=  r1r2) {
                    total++;
                }
            }
        }

        return total > 10_000_000 ? -1 : total;
    }

}
