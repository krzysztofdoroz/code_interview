package com.solutions.kd;

/**
 * Created by e-kfdz on 9/19/2017.
 */
public class NonOverlappingSegments {

    public int solution(int[] A, int[] B) {
        int N = A.length;

        int total = 1;
        int last = 0;

        for (int i = 1; i < N; i++){
            // can we add this one or is it already intersecting with the last?
            if((A[i] <= A[last] && A[last] <= B[i]) || (A[last] <= A[i] && A[i] <= B[last]) ) {
                //skip
            } else {
                total++;
                last = i;
            }

        }

        return total;
    }

}
