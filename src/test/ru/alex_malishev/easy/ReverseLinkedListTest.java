package ru.alex_malishev.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {

    private ReverseLinkedList mReverse;
    @Before
    public void setUp() throws Exception {
        mReverse = new ReverseLinkedList();
    }

    @Test
    public void reverseList() {

        int i = 0;
        int[] arr = new int[]{0, 1, 2, 3, 4, 5};
        int[] res = new int[]{5, 4, 3, 2, 1, 0};
        ReverseLinkedList.ListNode head = new ReverseLinkedList.ListNode(arr[i]);
        i++;
        ReverseLinkedList.ListNode node = head;
        while (i < arr.length){
            node.next = new ReverseLinkedList.ListNode(arr[i]);
            node = node.next;
            i++;
        }
        head = mReverse.reverseList(head);

        int[] actual = new int[arr.length];
        int k = 0;
        while (head != null){
            actual[k++] = head.val;
            head = head.next;
        }
        assertArrayEquals(res, actual);
    }

    @Test
    public void reverseListIterative() {
        int i = 0;
        int[] arr = new int[]{0, 1, 2, 3, 4, 5};
        int[] res = new int[]{5, 4, 3, 2, 1, 0};
        ReverseLinkedList.ListNode head = new ReverseLinkedList.ListNode(arr[i]);
        i++;
        ReverseLinkedList.ListNode node = head;
        while (i < arr.length){
            node.next = new ReverseLinkedList.ListNode(arr[i]);
            node = node.next;
            i++;
        }
        head = mReverse.reverseListIterative(head);

        int[] actual = new int[arr.length];
        int k = 0;
        while (head != null){
            actual[k++] = head.val;
            head = head.next;
        }
        assertArrayEquals(res, actual);
    }
}