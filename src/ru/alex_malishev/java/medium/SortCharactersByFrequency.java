package ru.alex_malishev.java.medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * Given a string, sort it in decreasing order based on the frequency of characters.
 *
 * Example 1:
 *
 * Input:
 * "tree"
 *
 * Output:
 * "eert"
 *
 * Explanation:
 * 'e' appears twice while 'r' and 't' both appear once.
 * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 * Example 2:
 *
 * Input:
 * "cccaaa"
 *
 * Output:
 * "cccaaa"
 *
 * Explanation:
 * Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
 * Note that "cacaca" is incorrect, as the same characters must be together.
 * Example 3:
 *
 * Input:
 * "Aabb"
 *
 * Output:
 * "bbAa"
 *
 * Explanation:
 * "bbaA" is also a valid answer, but "Aabb" is incorrect.
 * Note that 'A' and 'a' are treated as two different characters.
 */
public class SortCharactersByFrequency {

    public String frequencySort(String s) {
        if (s.isEmpty()) return "";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> queue = new PriorityQueue<>((Character c1, Character c2) -> map.get(c2) - map.get(c1));
        queue.addAll(map.keySet());
        StringBuilder stringBuilder = new StringBuilder();
        while (!queue.isEmpty()){
            char c = queue.poll();
            int freq = map.get(c);
            while (freq != 0){
                stringBuilder.append(c);
                freq--;
            }
        }
        return stringBuilder.toString();

    }
}
