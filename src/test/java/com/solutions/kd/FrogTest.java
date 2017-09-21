package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/21/2017.
 */
public class FrogTest {

    @Test
    public void t1(){
        Frog frog = new Frog();
        assertEquals(6, frog.solution(5, new int[]{1,3,1,4,2,3,5,4}));
    }

}
