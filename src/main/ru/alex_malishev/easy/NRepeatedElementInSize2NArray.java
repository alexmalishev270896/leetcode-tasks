package ru.alex_malishev.easy;

import java.util.HashMap;

/**
 * In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
 *
 * Return the element repeated N times.
 *
 * Example 1:
 *
 * Input: [1,2,3,3]
 * Output: 3
 * Example 2:
 *
 * Input: [2,1,2,5,3,2]
 * Output: 2
 */
public class NRepeatedElementInSize2NArray {

    public int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int N = A.length / 2;
        for (int i : A) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) == N) return i;
        }
        return -1;
    }
}
