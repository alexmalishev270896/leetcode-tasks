package ru.alex_malishev.java.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueNumberOfOccurrencesTest {

    private UniqueNumberOfOccurrences uniqueNumberOfOccurrences;

    @Before
    public void setUp() throws Exception {
        uniqueNumberOfOccurrences = new UniqueNumberOfOccurrences();
    }

    @Test
    public void uniqueOccurrencesExample1() {

        int[] arr = new int[]{1,2,2,1,1,3};

        assertTrue(uniqueNumberOfOccurrences.uniqueOccurrences(arr));
    }
    @Test
    public void uniqueOccurrencesExample2() {

        int[] arr = new int[]{1,2};

        assertFalse(uniqueNumberOfOccurrences.uniqueOccurrences(arr));
    }

    @Test
    public void uniqueOccurrencesExample3() {

        int[] arr = new int[]{-3,0,1,-3,1,1,1,-3,10,0};

        assertTrue(uniqueNumberOfOccurrences.uniqueOccurrences(arr));
    }
}