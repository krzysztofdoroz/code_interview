package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/21/2017.
 */
public class LeaderTest {

    @Test
    public void t1() {
        Leader leader = new Leader();
        assertEquals(2, leader.solution(new int[]{4,3,4,4,4,2}));
    }

}