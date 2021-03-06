package ru.alex_malishev.easy.linkedlist;

import org.junit.Before;
import org.junit.Test;
import ru.alex_malishev.base.linkedlist.ListNode;

import static org.junit.Assert.*;

public class MiddleOfLinkedListTest {

    private MiddleOfLinkedList mMiddle;

    @Before
    public void setUp() throws Exception {
        mMiddle = new MiddleOfLinkedList();
    }

    @Test
    public void middleNodeExample1() {

        int i = 2;

        ListNode head = new ListNode(1);
        ListNode node = head;
        while (i <= 5){
            node.next = new ListNode(i);
            node = node.next;
            i++;
        }

        assertEquals(3, mMiddle.middleNode(head).val );

    }

    @Test
    public void middleNodeExample2() {

        int i = 2;

        ListNode head = new ListNode(1);
        ListNode node = head;
        while (i <= 6){
            node.next = new ListNode(i);
            node = node.next;
            i++;
        }

        assertEquals(4, mMiddle.middleNode(head).val );

    }
}