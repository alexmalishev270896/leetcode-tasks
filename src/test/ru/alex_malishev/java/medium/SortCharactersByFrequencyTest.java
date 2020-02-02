package ru.alex_malishev.java.medium;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class SortCharactersByFrequencyTest {

    private SortCharactersByFrequency mCharactersByFrequency;

    @Before
    public void setUp() throws Exception {
        mCharactersByFrequency = new SortCharactersByFrequency();
    }

    @Test
    public void frequencySortExample1() {
        String s = "tree";
        String expected = "eert";

        assertEquals(expected, mCharactersByFrequency.frequencySort(s));
    }

    @Test
    public void frequencySortExample2() {
        String s = "cccaaa";
        String expected = "cccaaa";
        String expected2 = "aaaccc";

        MatcherAssert.assertThat(mCharactersByFrequency.frequencySort(s), either(is(expected)).or(is(expected2)));
    }

    @Test
    public void frequencySortExample3() {
        String s = "Aabb";
        String expected = "bbAa";

        assertEquals(expected, mCharactersByFrequency.frequencySort(s));
    }
}