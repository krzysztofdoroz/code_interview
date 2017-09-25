package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/25/2017.
 */
public class RopesTest {

    @Test
    public void t1() {
        Ropes ropes = new Ropes();
        assertEquals(3, ropes.solution(4, new int[]{1,2,3,4,1,1,3}));
    }

    @Test
    public void t2() {
        Ropes ropes = new Ropes();
        assertEquals(3, ropes.solution(0, new int[]{1,2,3}));
    }

    @Test
    public void t3() {
        Ropes ropes = new Ropes();
        assertEquals(2, ropes.solution(2, new int[]{1,2,3}));
    }

    @Test
    public void t4() {
        Ropes ropes = new Ropes();
        assertEquals(0, ropes.solution(2, new int[]{1}));
    }

}