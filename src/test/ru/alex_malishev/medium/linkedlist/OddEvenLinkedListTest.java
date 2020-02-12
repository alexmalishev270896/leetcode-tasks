package ru.alex_malishev.medium.linkedlist;

import org.junit.Before;
import org.junit.Test;
import ru.alex_malishev.base.linkedlist.LinkedListUtils;
import ru.alex_malishev.base.linkedlist.ListNode;

import static org.junit.Assert.*;

public class OddEvenLinkedListTest {

    private OddEvenLinkedList mOddEven;

    @Before
    public void setUp() throws Exception {
        mOddEven = new OddEvenLinkedList();
    }

    @Test
    public void oddEvenList() {

        int[] input = new int[]{2, 1, 3, 5, 6, 4, 7};
        int[] output = new int[]{2, 3, 6, 7, 1, 5, 4};
        ListNode head = LinkedListUtils.fillList(input);
        ListNode newHead = mOddEven.oddEvenList(head);

        assertArrayEquals(output, LinkedListUtils.toArray(newHead));

    }
}