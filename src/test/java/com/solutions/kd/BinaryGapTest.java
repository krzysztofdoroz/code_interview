package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/18/2017.
 */
public class BinaryGapTest {

    @Test
    public void shouldReturn0For0() {
        BinaryGap binaryGap = new BinaryGap();

        assertEquals(0, binaryGap.solution(0));
    }

    @Test
    public void shouldReturn2For9() {
        BinaryGap binaryGap = new BinaryGap();

        assertEquals(2, binaryGap.solution(9));
    }


    @Test
    public void shouldReturn4For529() {
        BinaryGap binaryGap = new BinaryGap();

        assertEquals(4, binaryGap.solution(529));
    }

    @Test
    public void shouldReturn1For20() {
        BinaryGap binaryGap = new BinaryGap();

        assertEquals(1, binaryGap.solution(20));
    }

    @Test
    public void shouldReturn0For15() {
        BinaryGap binaryGap = new BinaryGap();

        assertEquals(0, binaryGap.solution(15));
    }

}