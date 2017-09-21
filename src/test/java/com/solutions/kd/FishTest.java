package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/19/2017.
 */
public class FishTest {

    @Test
    public void t1() {
        Fish fish = new Fish();
        assertEquals(1, fish.solution(new int[]{12}, new int[]{0}));
    }

    @Test
    public void t2() {
        Fish fish = new Fish();
        assertEquals(2, fish.solution(new int[]{4,3,2,1,5}, new int[]{0,1,0,0,0}));
    }

    @Test
    public void t3() {
        Fish fish = new Fish();
        assertEquals(2, fish.solution(new int[]{4,3}, new int[]{0,1}));
    }

    @Test
    public void t4() {
        Fish fish = new Fish();
        assertEquals(2, fish.solution(new int[]{4,3,5}, new int[]{0,1,0}));
    }

    @Test
    public void t5() {
        Fish fish = new Fish();
        assertEquals(1, fish.solution(new int[]{41,3,5,8}, new int[]{1,0,0,0}));
    }

    @Test
    public void t6() {
        Fish fish = new Fish();
        assertEquals(4, fish.solution(new int[]{41,3,5,8}, new int[]{0,0,0,0}));
    }

    }