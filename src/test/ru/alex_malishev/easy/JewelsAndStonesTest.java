package ru.alex_malishev.easy;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JewelsAndStonesTest {

    private JewelsAndStones mJewelsAndStones;

    @Before
    public void init(){
        mJewelsAndStones = new JewelsAndStones();
    }

    @Test
    public void test_numJewelsInStonesExample1() {
        String S = "aAAbbbb";
        String J = "aA";
        int expectedResult = 3;

        assertEquals(mJewelsAndStones.numJewelsInStones(J, S), expectedResult);
    }

    @Test
    public void test_numJewelsInStonesExample2() {

        String S = "ZZ";
        String J = "z";
        int expectedResult = 0;
        assertEquals(mJewelsAndStones.numJewelsInStones(J, S), expectedResult);
    }

    @Test
    public void testEmptyStrings(){
        String S = "";
        String J = "";
        int expectedResult = 0;
        assertEquals(mJewelsAndStones.numJewelsInStones(J, S), expectedResult);
    }

    @Test
    public void testNonEmptyWithSpaceStrings(){
        String S = " ";
        String J = " ";
        int expectedResult = 0;
        assertEquals(mJewelsAndStones.numJewelsInStones(J, S), expectedResult);
    }
}