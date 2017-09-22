package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/22/2017.
 */
public class DominatorTest {

    @Test
    public void t1(){
        Dominator dominator = new Dominator();
        assertEquals(1, dominator.solution(new int[]{1,2,1}));
    }

    @Test
    public void t2(){
        Dominator dominator = new Dominator();
        assertEquals(3, dominator.solution(new int[]{3, 4, 3, 2, 3, -1, 3, 3}));
    }

}