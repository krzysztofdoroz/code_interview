package com.solutions.kd;

/**
 * Created by e-kfdz on 9/21/2017.
 */
public class Div {

    public int solution(int A, int B, int K) {
        long first = A + K - ( A % K);

        if (A % K == 0){
            first = A;
        }

        long result = (B - first) % K == 0 ? (B - first) / K : ((B - first) / K) + 1;

        return  Long.valueOf(result).intValue();
    }

}
