package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/19/2017.
 */
public class DisksTest {

    @Test
    public void t1() {
        Disks disks = new Disks();
        assertEquals(0, disks.solution(new int[]{0,0}));
    }

    @Test
    public void t2() {
        Disks disks = new Disks();
        assertEquals(1, disks.solution(new int[]{1,1}));
    }

    @Test
    public void t3() {
        Disks disks = new Disks();
        assertEquals(11, disks.solution(new int[]{1,5,2,1,4,0}));
    }

}