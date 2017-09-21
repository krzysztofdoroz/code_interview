package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/18/2017.
 */
public class OddArrayTest {

    @Test
    public void shouldReturn9() {
        OddArray oddArray = new OddArray();

        assertEquals(9, oddArray.solution(new int[]{9}));
    }

    @Test
    public void shouldReturn7() {
        OddArray oddArray = new OddArray();

        assertEquals(7, oddArray.solution(new int[]{9,7,9}));
    }

    @Test
    public void shouldReturn7LongTest() {
        OddArray oddArray = new OddArray();

        assertEquals(7, oddArray.solution(new int[]{9,3,9,3,9,7,9}));
    }

}