package ru.alex_malishev.java.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertBinaryNumberLinkedListToIntegerTest {

    private ConvertBinaryNumberLinkedListToInteger mConvert;

    @Before
    public void init(){
        mConvert = new ConvertBinaryNumberLinkedListToInteger();
    }
    @Test
    public void getDecimalValue() {
        ConvertBinaryNumberLinkedListToInteger.ListNode head = new ConvertBinaryNumberLinkedListToInteger.ListNode(1);
        head.next = new ConvertBinaryNumberLinkedListToInteger.ListNode(0);
        head.next.next = new ConvertBinaryNumberLinkedListToInteger.ListNode(1);

        assertEquals(5, mConvert.getDecimalValue(head));
    }
}