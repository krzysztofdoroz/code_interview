package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/22/2017.
 */
public class DistinctValsTest {

    @Test
    public void t1() {
        DistinctVals distinctVals = new DistinctVals();
        assertEquals(1, distinctVals.solution(new int[]{1}));
    }

    @Test
    public void t2() {
        DistinctVals distinctVals = new DistinctVals();
        assertEquals(2, distinctVals.solution(new int[]{1,2}));
    }

    @Test
    public void t3() {
        DistinctVals distinctVals = new DistinctVals();
        assertEquals(2, distinctVals.solution(new int[]{1,2,1,2}));
    }

    @Test
    public void t4() {
        DistinctVals distinctVals = new DistinctVals();
        assertEquals(3, distinctVals.solution(new int[]{2, 1, 1, 2, 3, 1}));
    }

}