package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/19/2017.
 */
public class TripletProductTest {

    @Test
    public void t1() {
        TripletProduct tripletProduct = new TripletProduct();
        assertEquals(60, tripletProduct.solution(new int[]{-3, 1,2,-2,5,6}));
    }

}