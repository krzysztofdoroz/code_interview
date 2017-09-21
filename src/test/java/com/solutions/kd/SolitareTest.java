package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/21/2017.
 */
public class SolitareTest {


    @Test
    public void t1() {
        Solitare solitare = new Solitare();
        assertEquals(8, solitare.solution(new int[]{1,-2,0,9,-1,-2}));
    }

    @Test
    public void t2() {
        Solitare solitare = new Solitare();
        assertEquals(2, solitare.solution(new int[]{1,1}));
    }

    @Test
    public void t3() {
        Solitare solitare = new Solitare();
        assertEquals(2, solitare.solution(new int[]{1,-100,1}));
    }

    @Test
    public void t4() {
        Solitare solitare = new Solitare();
        assertEquals(1, solitare.solution(new int[]{1,-1,-1,-1,-1,-1,-1,1}));
    }



}