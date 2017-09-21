package com.solutions.kd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e-kfdz on 9/20/2017.
 */
public class NonOverlappingSegmentsTest {

    @Test
    public void t1(){
        NonOverlappingSegments nonOverlappingSegments = new NonOverlappingSegments();
        assertEquals(1, nonOverlappingSegments.solution(new int[]{1}, new int[]{2}));
    }

    @Test
    public void t2(){
        NonOverlappingSegments nonOverlappingSegments = new NonOverlappingSegments();
        assertEquals(1, nonOverlappingSegments.solution(new int[]{1,2}, new int[]{2,3}));
    }

    @Test
    public void t4(){
        NonOverlappingSegments nonOverlappingSegments = new NonOverlappingSegments();
        assertEquals(2, nonOverlappingSegments.solution(new int[]{1, 3,1}, new int[]{2, 4,33}));
    }


    @Test
    public void t3(){
        NonOverlappingSegments nonOverlappingSegments = new NonOverlappingSegments();
        assertEquals(3, nonOverlappingSegments.solution(new int[]{1,3,7,9,9}, new int[]{5,6,8,9,10}));
    }

}