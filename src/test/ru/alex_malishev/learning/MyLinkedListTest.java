package ru.alex_malishev.learning;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void test() {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(7);
        obj.addAtTail(3);
        obj.addAtIndex(1, 2);
        assertEquals(2, obj.get(1));
        obj.deleteAtIndex(0);
        assertEquals(2, obj.get(0));
    }
}