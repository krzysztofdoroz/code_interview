package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/19/2017.
 */
public class MissingIntTest {

    @Test
    public void t1() {
        MissingInt missingInt = new MissingInt();
        assertEquals(1, missingInt.solution(new int[]{-1,0}));
    }

    @Test
    public void t2() {
        MissingInt missingInt = new MissingInt();
        assertEquals(1, missingInt.solution(new int[]{}));
    }

    @Test
    public void t3() {
        MissingInt missingInt = new MissingInt();
        assertEquals(2, missingInt.solution(new int[]{1,3,4,5}));
    }

    @Test
    public void t4() {
        MissingInt missingInt = new MissingInt();
        assertEquals(5, missingInt.solution(new int[]{1, 3, 6, 4, 1, 2}));
    }

    @Test
    public void t5() {
        MissingInt missingInt = new MissingInt();
        assertEquals(4, missingInt.solution(new int[]{1, 2, 3}));
    }

}