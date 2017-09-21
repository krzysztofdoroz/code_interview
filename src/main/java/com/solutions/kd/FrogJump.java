package com.solutions.kd;

/**
 * Created by e-kfdz on 9/18/2017.
 */
public class FrogJump {

    public int solution(int X, int Y, int D) {
        if ((Y -X) % D == 0){
            return (Y - X)/D;
        } else {
            return (Y - X)/D + 1;
        }
    }
}
