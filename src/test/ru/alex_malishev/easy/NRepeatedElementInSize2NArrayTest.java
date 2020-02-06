package ru.alex_malishev.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NRepeatedElementInSize2NArrayTest {

    private NRepeatedElementInSize2NArray mRepetead;

    @Before
    public void setUp() throws Exception {
        mRepetead = new NRepeatedElementInSize2NArray();
    }

    @Test
    public void repeatedNTimesEx1() {
        int[] A = new int[]{1,2,3,3};
        int expected = 3;
        assertEquals(expected, mRepetead.repeatedNTimes(A));
    }

    @Test
    public void repeatedNTimesEx2() {
        int[] A = new int[]{2,1,2,5,3,2};
        int expected = 2;
        assertEquals(expected, mRepetead.repeatedNTimes(A));
    }

    @Test
    public void repeatedNTimesEx3(){
        int[] A = new int[]{5,1,5,2,5,3,5,4};
        int expected = 5;
        assertEquals(expected, mRepetead.repeatedNTimes(A));
    }
}