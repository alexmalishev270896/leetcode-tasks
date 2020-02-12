package ru.alex_malishev.medium;

import org.junit.Before;
import org.junit.Test;
import ru.alex_malishev.base.linkedlist.ListNode;
import ru.alex_malishev.medium.linkedlist.NextGreaterNodeInLinkedList;

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
        ListNode head = new ListNode(2);
        ListNode node = head;
        while (i < 3){
            node.next = new ListNode(arr[i]);
            node = node.next;
            i++;
        }

        assertArrayEquals(res, mNodeInLinkedList.nextLargerNodes(head));
    }

    @Test
    public void nextLargerNodesStack() {

        int i = 1;
        int[] arr = new int[]{2, 1, 5};
        int[] res = new int[]{5, 5, 0};
        ListNode head = new ListNode(2);
        ListNode node = head;
        while (i < 3){
            node.next = new ListNode(arr[i]);
            node = node.next;
            i++;
        }

        assertArrayEquals(res, mNodeInLinkedList.nextLargerNodesStack(head));
    }
}