package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/25/2017.
 */
public class TrianglesTest {

    @Test
    public void t1() {
        Triangles triangles = new Triangles();
        assertEquals(0, triangles.solution(new int[]{}));
    }

    @Test
    public void t2() {
        Triangles triangles = new Triangles();
        assertEquals(4, triangles.solution(new int[]{10,2,5,1,8,12}));
    }

}