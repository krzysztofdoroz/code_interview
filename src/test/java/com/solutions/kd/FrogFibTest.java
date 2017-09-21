package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/20/2017.
 */
public class FrogFibTest {


    @Test
    public void t1() {
        FrogFib frogFib = new FrogFib();
        assertEquals(1, frogFib.solution(new int[]{}));
    }

    @Test
    public void t2() {
        FrogFib frogFib = new FrogFib();
        assertEquals(1, frogFib.solution(new int[]{1}));
    }

    @Test
    public void t3() {
        FrogFib frogFib = new FrogFib();
        assertEquals(1, frogFib.solution(new int[]{4}));
    }

    @Test
    public void t4() {
        FrogFib frogFib = new FrogFib();
        assertEquals(3, frogFib.solution(new int[]{0,0,0,1,1,0,1,0,0,0,0}));
    }


}