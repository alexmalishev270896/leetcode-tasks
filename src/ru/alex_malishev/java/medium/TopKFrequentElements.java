package ru.alex_malishev.java.medium;


import java.util.*;

/**
 *  Given a non-empty array of integers, return the k most frequent elements.
 *  Example 1:
 *
 *  Input: nums = [1,1,1,2,2,3], k = 2
 *  Output: [1,2]
 *
 *  My questions:
 *   - Can array contain negative values?
 *   - How many elements could be in the array? (Maximum)
 *   - Does the array sorted? How?
 *
 *
 */
public class TopKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(count::get));

        for (int f : count.keySet()){
            queue.add(f);
            if (queue.size() > k){
                queue.poll();
            }
        }
        List<Integer> result = new ArrayList<>(k);
        while (!queue.isEmpty()){
            result.add(queue.poll());
        }
        Collections.reverse(result);
        return result;
    }
}
