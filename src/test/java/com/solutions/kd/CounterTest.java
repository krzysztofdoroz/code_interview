package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/21/2017.
 */
public class CounterTest {

    @Test
    public void t1() {
        Counter counter = new Counter();
        assertArrayEquals(new int[]{3,2,2,4,2}, counter.solution(5, new int[]{3,4,4,6,1,4,4}));
    }

}