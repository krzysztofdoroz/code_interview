package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/22/2017.
 */
public class BinPlanksTest {

    @Test
    public void t1() {
        BinPlanks binPlanks = new BinPlanks();
        assertEquals(4, binPlanks.solution(new int[]{1,4,5,8}, new int[]{4,5,9,10}, new int[]{4,6,7,10,2}));
    }

    @Test
    public void t2() {
        BinPlanks binPlanks = new BinPlanks();
        assertEquals(-1, binPlanks.solution(new int[]{2}, new int[]{2}, new int[]{1}));
    }

}