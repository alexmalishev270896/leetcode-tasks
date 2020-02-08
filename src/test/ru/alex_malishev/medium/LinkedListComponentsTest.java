package ru.alex_malishev.medium;

import org.junit.Before;
import org.junit.Test;
import ru.alex_malishev.base.linkedlist.ListNode;

import static org.junit.Assert.*;

public class LinkedListComponentsTest {

    private LinkedListComponents mComponents;

    @Before
    public void setUp() throws Exception {
        mComponents = new LinkedListComponents();
    }

    @Test
    public void numComponentsExample1() {

        int i = 0;
        int[] arr = new int[]{0, 1, 2, 3};
        int[] G = new int[]{0, 1, 3};
        int res = 2;
        ListNode head = new ListNode(arr[i]);
        i++;
        ListNode node = head;
        while (i < 4){
            node.next = new ListNode(arr[i]);
            node = node.next;
            i++;
        }

        assertEquals(res, mComponents.numComponents(head, G));
    }

    @Test
    public void numComponentsExample2() {

        int i = 0;
        int[] arr = new int[]{0, 1, 2, 3, 4};
        int[] G = new int[]{0, 3, 1, 4};
        int res = 2;
        ListNode head = new ListNode(arr[i]);
        i++;
        ListNode node = head;
        while (i < arr.length){
            node.next = new ListNode(arr[i]);
            node = node.next;
            i++;
        }

        assertEquals(res, mComponents.numComponents(head, G));
    }

    @Test
    public void numComponentsExample3() {

        int i = 0;
        int[] arr = new int[]{0, 1, 2};
        int[] G = new int[]{0, 2};
        int res = 2;
        ListNode head = new ListNode(arr[i]);
        i++;
        ListNode node = head;
        while (i < arr.length){
            node.next = new ListNode(arr[i]);
            node = node.next;
            i++;
        }

        assertEquals(res, mComponents.numComponents(head, G));
    }
}