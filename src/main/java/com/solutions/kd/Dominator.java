package com.solutions.kd;

/**
 * Created by e-kfdz on 9/22/2017.
 */
public class Dominator {

    public int solution(int[] A) {
        int N = A.length;

        if (N == 0) {
            return -1;
        }

        int dom = A[0];
        int count = 1;

        for(int i = 1; i < N; i++) {
            if (dom == A[i]) {
                count++;
            } else {
                if (count == 0) {
                    dom = A[i];
                    count = 1;
                } else {
                    count--;
                }
            }
        }

        int totalCount = 0;
        int lastOccurence = 0;
        //check if dom is actually a dom
        for (int i = 0; i< N; i++) {
            if (A[i] == dom) {
                totalCount++;
                lastOccurence = i;
            }
        }

        return totalCount > N/2 ? lastOccurence : -1;
    }

}
