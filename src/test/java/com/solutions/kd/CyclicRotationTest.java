package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/18/2017.
 */
public class CyclicRotationTest {

    @Test
    public void testFromExample() {
        CyclicRotation cyclicRotation = new CyclicRotation();

        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3));
    }

    @Test
    public void shouldReturnTheSameArray() {
        CyclicRotation cyclicRotation = new CyclicRotation();

        assertArrayEquals(new int[]{9}, cyclicRotation.solution(new int[]{9}, 3));
    }

    @Test
    public void moveBy1() {
        CyclicRotation cyclicRotation = new CyclicRotation();

        assertArrayEquals(new int[]{2,1}, cyclicRotation.solution(new int[]{1,2}, 1));
    }

    @Test
    public void moveBy2() {
        CyclicRotation cyclicRotation = new CyclicRotation();

        assertArrayEquals(new int[]{2,3,1}, cyclicRotation.solution(new int[]{1,2,3}, 2));
    }

}