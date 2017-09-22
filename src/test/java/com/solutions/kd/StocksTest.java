package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/22/2017.
 */
public class StocksTest {

    @Test
    public void t1() {
        Stocks stocks = new Stocks();
        assertEquals(356, stocks.solution(new int[]{23171,21011,21123,21366,21013,21367}));
    }

    @Test
    public void t2() {
        Stocks stocks = new Stocks();
        assertEquals(0, stocks.solution(new int[]{23171,21,3,2,1}));
    }

    @Test
    public void t3() {
        Stocks stocks = new Stocks();
        assertEquals(0, stocks.solution(new int[]{}));
    }

}