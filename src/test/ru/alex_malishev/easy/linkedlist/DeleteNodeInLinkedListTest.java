package ru.alex_malishev.easy.linkedlist;

import org.junit.Before;
import org.junit.Test;
import ru.alex_malishev.base.linkedlist.ListNode;

import static org.junit.Assert.*;

public class DeleteNodeInLinkedListTest {

    private DeleteNodeInLinkedList deleteNodeInLinkedList;

    @Before
    public void setUp() throws Exception {
        deleteNodeInLinkedList = new DeleteNodeInLinkedList();
    }

    @Test
    public void deleteNode() {

        int i = 0;
        int[] arr = new int[]{4, 5, 1, 9};
        int[] expected = new int[] {4,1,9};
        ListNode head = new ListNode(arr[i]);
        i++;
        ListNode node = head;
        while (i < arr.length){
            node.next = new ListNode(arr[i]);
            node = node.next;
            i++;
        }
        deleteNodeInLinkedList.deleteNode(head.next);
        int[] result = new int[expected.length];
        int k = 0;
        while (head != null) {
            result[k++] = head.val;
            head = head.next;
        }
        assertArrayEquals(expected, result);
    }
}