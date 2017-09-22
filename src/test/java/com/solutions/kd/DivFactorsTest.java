package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/22/2017.
 */
public class DivFactorsTest {

    @Test
    public void t1() {
        DivFactors divFactors = new DivFactors();
        assertEquals(8, divFactors.solution(24));
    }

    @Test
    public void t2() {
        DivFactors divFactors = new DivFactors();
        assertEquals(2, divFactors.solution(13));
    }

    @Test
    public void t3() {
        DivFactors divFactors = new DivFactors();
        assertEquals(3, divFactors.solution(9));
    }

    @Test
    public void t4() {
        DivFactors divFactors = new DivFactors();
        assertEquals(6, divFactors.solution(18));
    }

}