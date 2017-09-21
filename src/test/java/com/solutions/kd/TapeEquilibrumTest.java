package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/18/2017.
 */
public class TapeEquilibrumTest {

    @Test
    public void exampleTest(){
        TapeEquilibrum tapeEquilibrum = new TapeEquilibrum();

        assertEquals(1, tapeEquilibrum.solution(new int[]{3,1,2,4,3}));
    }

    @Test
    public void simpleTest(){
        TapeEquilibrum tapeEquilibrum = new TapeEquilibrum();

        assertEquals(0, tapeEquilibrum.solution(new int[]{3,3,3,3}));
    }

    @Test
    public void twoElementsTest(){
        TapeEquilibrum tapeEquilibrum = new TapeEquilibrum();

        assertEquals(2000, tapeEquilibrum.solution(new int[]{-1000, 1000}));
    }

}