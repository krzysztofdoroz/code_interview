package com.solutions.kd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by e-kfdz on 9/20/2017.
 */
public class FrogFib {

    public int solution(int[] A) {
        int N = A.length;

        List<Integer> fibs = fib();

        int totalMin = Integer.MAX_VALUE;

        int[] mins = new int[N+1];
        Arrays.fill(mins, 100_000);

        // initial jumps
        int start = -1;
        for (Integer jump : fibs) {
            if (start + jump < N && A[start + jump] > 0) {
                mins[start + jump] = 1;
            } else if (start + jump == N) {
                return  1;
            }
        }

        for (int i = 0; i < N; i++) {
            if (A[i] > 0 && mins[i] > 0) {
                for (Integer jump : fibs) {
                    if (i + jump < N && A[i + jump] > 0){
                        mins[i + jump] = Math.min(1 + mins[i], mins[i + jump]);
                    } else if (i + jump == N) {
                        totalMin = Math.min(totalMin, mins[i] + 1);
                    }
                }
            }
        }

        return totalMin < 100_000 ? totalMin : -1;
    }

    private List<Integer> fib() {
        int a = 1;
        int b = 1;

        List<Integer> result = new ArrayList<>(256);

        result.add(a);
        result.add(b);

        boolean cont = true;

        while(cont) {
            int c = a + b;
            a = b;
            b = c;
            result.add(c);

            if (c > 100_000) {
                cont = false;
            }
        }

//        Collections.reverse(result);

        return result;
    }

}
