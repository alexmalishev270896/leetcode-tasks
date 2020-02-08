package ru.alex_malishev.easy.linkedlist;

import org.junit.Before;
import org.junit.Test;
import ru.alex_malishev.base.linkedlist.ListNode;

import static org.junit.Assert.*;

public class LinkedListCycleTest {

    private LinkedListCycle mCycle;

    @Before
    public void setUp() throws Exception {
        mCycle = new LinkedListCycle();
    }

    /**
     * Example 1:
     * Input: head = [3,2,0,-4], pos = 1
     * Output: true
     * Explanation: There is a cycle in the linked list, where tail connects to the second node.
     */
    @Test
    public void hasCycleExample1() {

        int[] input = new int[]{3, 2, 0, -4};
        int pos = 1;
        ListNode head = null;
        ListNode tail = null;
        ListNode cycle = null;

        int i = 0;
        while (i < input.length){
            if (head == null){
                head = new ListNode(input[i]);
                tail = head;
            }else {
                tail.next = new ListNode(input[i]);
                tail = tail.next;
            }
            if (i == pos) cycle = tail;
            i++;
        }
        tail.next = cycle;
        assertTrue(mCycle.hasCycle(head));
    }

    /**
     * Example 2:
     * Input: head = [1,2], pos = 0
     * Output: true
     * Explanation: There is a cycle in the linked list, where tail connects to the first node.
     */
    @Test
    public void hasCycleExample2() {

        int[] input = new int[]{1, 2};
        int pos = 0;
        ListNode head = null;
        ListNode tail = null;
        ListNode cycle = null;

        int i = 0;
        while (i < input.length){
            if (head == null){
                head = new ListNode(input[i]);
                tail = head;
            }else {
                tail.next = new ListNode(input[i]);
                tail = tail.next;
            }
            if (i == pos) cycle = tail;
            i++;
        }
        tail.next = cycle;
        assertTrue(mCycle.hasCycle(head));
    }

    /**
     * Example 3:
     * Input: head = [1], pos = -1
     * Output: false
     * Explanation: There is no cycle in the linked list.
     */
    @Test
    public void hasCycleExample3() {

        int[] input = new int[]{1};
        int pos = -1;
        ListNode head = null;
        ListNode tail = null;
        ListNode cycle = null;

        int i = 0;
        while (i < input.length){
            if (head == null){
                head = new ListNode(input[i]);
                tail = head;
            }else {
                tail.next = new ListNode(input[i]);
                tail = tail.next;
            }
            if (i == pos) cycle = tail;
            i++;
        }
        tail.next = cycle;
        assertFalse(mCycle.hasCycle(head));
    }
}