package com.solutions.kd;

/**
 * Created by e-kfdz on 9/21/2017.
 */
public class Leader {

    public int solution(int[] A) {
        int N = A.length;
        int leader = findLeader(A);

        int[] counts = new int[N];
        int totalLeaderCount = 0;
        for (int i = 0; i< N; i++) {
            if (A[i] == leader) {
                totalLeaderCount++;
                counts[i] = totalLeaderCount;
            } else {
                counts[i] = totalLeaderCount;
            }
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            if(counts[i] > (i+1)/2 && (totalLeaderCount-counts[i]) > (N - i - 1)/2) {
                result++;
            }

        }

        return result;
    }


    private int findLeader(int[] E) {
        int count = 1;
        int leader = E[0];

        for (int i = 1; i< E.length; i++) {
            if (count == 0) {
                leader = E[i];
                count = 1;
            } else if (E[i] != leader) {
                count--;
            } else {
                count++;
            }
        }

        return leader;
    }

}
