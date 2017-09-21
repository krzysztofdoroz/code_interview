package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/21/2017.
 */
public class DivTest {

    @Test
    public void t1(){
        Div div = new Div();
        assertEquals(3, div.solution(6,11,2));
    }

    @Test
    public void t2(){
        Div div = new Div();
        assertEquals(2, div.solution(6,11,3));
    }

    @Test
    public void t3(){
        Div div = new Div();
        assertEquals(1, div.solution(6,11,5));
    }


}