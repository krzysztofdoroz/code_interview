package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/20/2017.
 */
public class TreeHeightTest {

    @Test
    public void t1() {
        TreeHeight treeHeight = new TreeHeight();
        assertEquals(-1, treeHeight.solution(null));
    }

    @Test
    public void t2() {
        TreeHeight treeHeight = new TreeHeight();
        Tree t = new Tree();

        assertEquals(0, treeHeight.solution(t));
    }

    @Test
    public void t3() {
        TreeHeight treeHeight = new TreeHeight();
        Tree t = new Tree();
        Tree t2 = new Tree();
        t.l = t2;

        assertEquals(1, treeHeight.solution(t));
    }

    @Test
    public void t4() {
        TreeHeight treeHeight = new TreeHeight();
        Tree t5 = new Tree();
        Tree t3 = new Tree();
        Tree t20 = new Tree();
        Tree t21 = new Tree();
        Tree t10 = new Tree();
        Tree t1 = new Tree();
        t5.l = t3;
        t5.r = t10;
        t3.l = t20;
        t3.r = t21;
        t10.l = t1;

        assertEquals(2, treeHeight.solution(t5));
    }

}