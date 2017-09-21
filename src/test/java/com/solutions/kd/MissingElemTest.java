package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/18/2017.
 */
public class MissingElemTest {

    @Test
    public void testMissing2() {
        MissingElem missingElem = new MissingElem();

        assertEquals(2, missingElem.solution(new int[]{1,3}));
    }

    @Test
    public void sampleTest() {
        MissingElem missingElem = new MissingElem();

        assertEquals(4, missingElem.solution(new int[]{2,3,1,5}));
    }

    @Test
    public void emptyTest() {
        MissingElem missingElem = new MissingElem();

        assertEquals(1, missingElem.solution(new int[]{}));
    }

    @Test
    public void singleElemTest() {
        MissingElem missingElem = new MissingElem();

        assertEquals(1, missingElem.solution(new int[]{2}));
    }

    @Test
    public void intTest() {
        int N = 100000;
        long result = ((N + 1) * (N + 2))/2;
        System.out.println(result);
        assertTrue(result > 0);
    }


}