package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/20/2017.
 */
public class LadderTest {

    @Test
    public void t1() {
        Ladder ladder = new Ladder();
        assertArrayEquals(new int[]{5}, ladder.solution(new int[]{4}, new int[]{3}));
    }

    @Test
    public void t2() {
        Ladder ladder = new Ladder();
        assertArrayEquals(new int[]{5,1,8,0,1}, ladder.solution(new int[]{4,4,5,5,1}, new int[]{3,2,4,3,1}));
    }

}