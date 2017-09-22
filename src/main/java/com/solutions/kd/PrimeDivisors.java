package com.solutions.kd;

/**
 * Created by e-kfdz on 9/21/2017.
 */
public class PrimeDivisors {

    public int solution(int[] A, int[] B) {
        int N = A.length;

        int total = 0;

        for (int i = 0; i < N; i++) {
            int a = A[i];
            int b = B[i];
            int gcd = gcd(A[i], B[i]);



            while (true) {
                a = a / gcd;
                b = b / gcd;
              //  if ()
            }
        }

        return total;
    }

    private int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else
            return gcd(b, a % b);
    }

}
