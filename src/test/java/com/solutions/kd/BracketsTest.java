package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/18/2017.
 */
public class BracketsTest {

    @Test
    public void testEmptyExp() {
        Brackets brackets = new Brackets();
        assertEquals(1, brackets.solution(""));
    }

    @Test
    public void testSingleBracket() {
        Brackets brackets = new Brackets();
        assertEquals(0, brackets.solution("("));
    }

    @Test
    public void testSingleBracket2() {
        Brackets brackets = new Brackets();
        assertEquals(0, brackets.solution(")"));
    }

    @Test
    public void testSimpleCorrectExpr() {
        Brackets brackets = new Brackets();
        assertEquals(1, brackets.solution("(){}[]"));
    }

    @Test
    public void testNestedExpr() {
        Brackets brackets = new Brackets();
        assertEquals(1, brackets.solution("({}[()])"));
    }

    @Test
    public void sampleTest1() {
        Brackets brackets = new Brackets();
        assertEquals(1, brackets.solution("{[()()]}"));
    }

    @Test
    public void sampleTest2() {
        Brackets brackets = new Brackets();
        assertEquals(0, brackets.solution("([)()]"));
    }

}