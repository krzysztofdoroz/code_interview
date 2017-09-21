package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/18/2017.
 */
public class FrogJumpTest {

    @Test
    public void exampleTest() {
        FrogJump frogJump = new FrogJump();

        assertEquals(3, frogJump.solution(10, 85, 30));
    }

    @Test
    public void secondTest() {
        FrogJump frogJump = new FrogJump();

        assertEquals(2, frogJump.solution(1, 5, 2));
    }

}