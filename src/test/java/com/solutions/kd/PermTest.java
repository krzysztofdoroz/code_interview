package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/21/2017.
 */
public class PermTest {

    @Test
    public void t1() {
        Perm perm = new Perm();
        assertEquals(1, perm.solution(new int[]{1}));
    }

    @Test
    public void t2() {
        Perm perm = new Perm();
        assertEquals(1, perm.solution(new int[]{1,3,2}));
    }

    @Test
    public void t3() {
        Perm perm = new Perm();
        assertEquals(0, perm.solution(new int[]{1,4,2}));
    }

}