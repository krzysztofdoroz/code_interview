package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/21/2017.
 */
public class MinAbsSumTest {

    @Test
    public void t1() {
        MinAbsSum minAbsSum = new MinAbsSum();
        assertEquals(1, minAbsSum.solution(new int[]{1,4,-3}));
    }

    @Test
    public void t2() {
        MinAbsSum minAbsSum = new MinAbsSum();
        assertEquals(2, minAbsSum.solution(new int[]{1}));
    }

    @Test
    public void t3() {
        MinAbsSum minAbsSum = new MinAbsSum();
        assertEquals(0, minAbsSum.solution(new int[]{1,0}));
    }

    @Test
    public void t4() {
        MinAbsSum minAbsSum = new MinAbsSum();
        assertEquals(0, minAbsSum.solution(new int[]{1,20,-1}));
    }


    @Test
    public void t5() {
        MinAbsSum minAbsSum = new MinAbsSum();
        assertEquals(3, minAbsSum.solution(new int[]{-8, 4, 5, -10, 3}));
    }



}