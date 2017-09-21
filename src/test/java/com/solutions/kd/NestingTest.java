package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/18/2017.
 */
public class NestingTest {

    @Test
    public void testEmptyExpr() {
        Nesting nesting = new Nesting();
        assertEquals(1, nesting.solution(""));
    }

    @Test
    public void testSimpleExpr() {
        Nesting nesting = new Nesting();
        assertEquals(0, nesting.solution("("));
    }

    @Test
    public void test3() {
        Nesting nesting = new Nesting();
        assertEquals(0, nesting.solution(")"));
    }

    @Test
    public void test4() {
        Nesting nesting = new Nesting();
        assertEquals(0, nesting.solution(")("));
    }

    @Test
    public void test5() {
        Nesting nesting = new Nesting();
        assertEquals(1, nesting.solution("()"));
    }

    @Test
    public void test6() {
        Nesting nesting = new Nesting();
        assertEquals(1, nesting.solution("(()(())())"));
    }

    @Test
    public void test7() {
        Nesting nesting = new Nesting();
        assertEquals(0, nesting.solution("())"));
    }

}