package ru.alex_malishev.java.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NextGreaterNodeInLinkedListTest {

    private NextGreaterNodeInLinkedList mNodeInLinkedList;

    @Before
    public void setUp() throws Exception {

        mNodeInLinkedList = new NextGreaterNodeInLinkedList();
    }

    @Test
    public void nextLargerNodes() {

        int i = 1;
        int[] arr = new int[]{2, 1, 5};
        int[] res = new int[]{5, 5, 0};
        NextGreaterNodeInLinkedList.ListNode head = new NextGreaterNodeInLinkedList.ListNode(2);
        NextGreaterNodeInLinkedList.ListNode node = head;
        while (i < 3){
            node.next = new NextGreaterNodeInLinkedList.ListNode(arr[i]);
            node = node.next;
            i++;
        }

        assertArrayEquals(res, mNodeInLinkedList.nextLargerNodes(head));
    }
}