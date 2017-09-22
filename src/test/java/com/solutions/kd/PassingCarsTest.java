package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/22/2017.
 */
public class PassingCarsTest {

    @Test
    public void t1() {
        PassingCars passingCars = new PassingCars();
        assertEquals(1, passingCars.solution(new int[]{0,1}));
    }

    @Test
    public void t2() {
        PassingCars passingCars = new PassingCars();
        assertEquals(5, passingCars.solution(new int[]{0,1,0,1,1}));
    }

    @Test
    public void t3() {
        PassingCars passingCars = new PassingCars();
        assertEquals(0, passingCars.solution(new int[]{0}));
    }

}