package ru.alex_malishev.easy.linkedlist;

import org.junit.Before;
import org.junit.Test;
import ru.alex_malishev.base.linkedlist.ListNode;

import static org.junit.Assert.*;

public class ConvertBinaryNumberLinkedListToIntegerTest {

    private ConvertBinaryNumberLinkedListToInteger mConvert;

    @Before
    public void init(){
        mConvert = new ConvertBinaryNumberLinkedListToInteger();
    }
    @Test
    public void getDecimalValue() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);

        assertEquals(5, mConvert.getDecimalValue(head));
    }
}