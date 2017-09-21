package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/19/2017.
 */
public class TriangleTest {

    @Test
    public void t1() {
        Triangle triangle = new Triangle();
        assertEquals(0, triangle.solution(new int[]{1,2}));
    }

    @Test
    public void t2() {
        Triangle triangle = new Triangle();
        assertEquals(1, triangle.solution(new int[]{3,4,5}));
    }

    @Test
    public void t3() {
        Triangle triangle = new Triangle();
        assertEquals(1, triangle.solution(new int[]{10,2,5,1,8,20}));
    }

    @Test
    public void t4() {
        Triangle triangle = new Triangle();
        assertEquals(1, triangle.solution(new int[]{2,2,2,2,2,2}));
    }
}