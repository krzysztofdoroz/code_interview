package com.solutions.kd;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by e-kfdz on 9/21/2017.
 */
public class Frog {

    public int solution(int X, int[] A) {
        int N = A.length;

        Set<Integer> missingLeaves = new HashSet<>();

        for (int i = 1; i <= X; i++) {
            missingLeaves.add(i);
        }

        for (int i = 0; i < N; i++) {
            missingLeaves.remove(A[i]);
            if (missingLeaves.isEmpty()) {
                return i;
            }
        }

        return -1;
    }

}
