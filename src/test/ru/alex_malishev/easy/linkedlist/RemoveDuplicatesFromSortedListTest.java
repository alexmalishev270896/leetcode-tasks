package ru.alex_malishev.easy.linkedlist;

import org.junit.Before;
import org.junit.Test;
import ru.alex_malishev.base.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedListTest {

    private RemoveDuplicatesFromSortedList mRemoveDuplicatesFromSortedList;


    @Before
    public void setUp() throws Exception {
        mRemoveDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
    }

    /**
     * Example 1:
     * Input: 1->1->2
     * Output: 1->2
     */
    @Test
    public void deleteDuplicatesExample1() {
        int[] input = new int[]{1, 1, 2};
        int[] output = new int[]{1, 2};
        ListNode head = null;
        ListNode tail = null;
        int i = 0;
        while (i < input.length){
            if (head == null){
                head = new ListNode(input[i]);
                tail = head;
            }else {
                tail.next = new ListNode(input[i]);
                tail = tail.next;
            }
            i++;
        }
        List<Integer> actual = new ArrayList<>();

        ListNode newHead = mRemoveDuplicatesFromSortedList.deleteDuplicates(head);
        while (newHead != null){
            actual.add(newHead.val);
            newHead = newHead.next;
        }

        assertArrayEquals(output, actual.stream().mapToInt(Integer::intValue).toArray());
    }

    /**
     * Example 2:
     * Input: 1->1->2->3->3
     * Output: 1->2->3
     */
    @Test
    public void deleteDuplicatesExample2() {
        int[] input = new int[]{1, 1, 2, 3, 3};
        int[] output = new int[]{1, 2, 3};
        ListNode head = null;
        ListNode tail = null;
        int i = 0;
        while (i < input.length){
            if (head == null){
                head = new ListNode(input[i]);
                tail = head;
            }else {
                tail.next = new ListNode(input[i]);
                tail = tail.next;
            }
            i++;
        }
        List<Integer> actual = new ArrayList<>();

        ListNode newHead = mRemoveDuplicatesFromSortedList.deleteDuplicates(head);
        while (newHead != null){
            actual.add(newHead.val);
            newHead = newHead.next;
        }

        assertArrayEquals(output, actual.stream().mapToInt(Integer::intValue).toArray());
    }

    /**
     * Example 3:
     * Input: -1->-1->0->2->2->3->10->10->20
     * Output: -1->0->2->3->10->20
     */
    @Test
    public void deleteDuplicatesExample3() {
        int[] input = new int[]{-1, -1, 0, 2, 2, 3, 10, 10, 20};
        int[] output = new int[]{-1, 0, 2, 3, 10, 20};
        ListNode head = null;
        ListNode tail = null;
        int i = 0;
        while (i < input.length){
            if (head == null){
                head = new ListNode(input[i]);
                tail = head;
            }else {
                tail.next = new ListNode(input[i]);
                tail = tail.next;
            }
            i++;
        }
        List<Integer> actual = new ArrayList<>();

        ListNode newHead = mRemoveDuplicatesFromSortedList.deleteDuplicates(head);
        while (newHead != null){
            actual.add(newHead.val);
            newHead = newHead.next;
        }

        assertArrayEquals(output, actual.stream().mapToInt(Integer::intValue).toArray());
    }

    /**
     * Example 4:
     * Input: null
     * Output: null
     */
    @Test
    public void deleteDuplicatesExample4() {
        ListNode newHead = mRemoveDuplicatesFromSortedList.deleteDuplicates(null);
        assertNull(newHead);
    }


}