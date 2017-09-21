package com.solutions.kd;

import java.util.Stack;

/**
 * Created by e-kfdz on 9/19/2017.
 */
public class Fish {

    public int solution(int[] A, int[] B) {
        Stack<Integer> fish = new Stack<Integer>();

        for (int i = 0; i < A.length; i++) {
            if (fish.empty()) {
                fish.push(i);
            } else if (B[i] == B[fish.peek()]) {
                fish.push(i);
            } else if (B[i] == 1 && B[fish.peek()] == 0) {
                fish.push(i);
            } else {
                boolean add = false;
                while (!fish.empty() && B[fish.peek()] != B[i]) {
                    int lastFish = fish.peek();
                    if (A[lastFish] > A[i]) {
                        add = false;
                        break;
                    } else {
                        fish.pop();
                        add = true;
                    }
                }

                if (fish.empty() || add) {
                    fish.push(i);
                }
            }
        }

//        System.out.println("stack:");
//        while(!fish.empty()) {
//            System.out.println(fish.pop());
//        }

        return fish.size();
    }

}
