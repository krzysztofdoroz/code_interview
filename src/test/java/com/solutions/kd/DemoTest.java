package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/21/2017.
 */
public class DemoTest {

    @Test
    public void t1() {
        Demo demo = new Demo();
        assertEquals(1, demo.solution(new int[]{-1,-3}));
    }

    @Test
    public void t2() {
        Demo demo = new Demo();
        assertEquals(4, demo.solution(new int[]{1,2,3}));
    }

    @Test
    public void t3() {
        Demo demo = new Demo();
        assertEquals(5, demo.solution(new int[]{1,3,6,4,1,2}));
    }

    @Test
    public void t4() {
        Demo demo = new Demo();
        assertEquals(1, demo.solution(new int[]{0}));
    }

    @Test
    public void t5() {
        Demo demo = new Demo();
        assertEquals(2, demo.solution(new int[]{1}));
    }

    @Test
    public void t6() {
        Demo demo = new Demo();
        assertEquals(1, demo.solution(new int[]{12}));
    }


}