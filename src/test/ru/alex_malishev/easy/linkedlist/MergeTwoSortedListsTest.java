package ru.alex_malishev.easy.linkedlist;

import org.junit.Before;
import org.junit.Test;
import ru.alex_malishev.base.linkedlist.ListNode;

import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {

    private MergeTwoSortedLists mergeTwoSortedLists;

    @Before
    public void setUp() throws Exception {
        mergeTwoSortedLists = new MergeTwoSortedLists();
    }

    @Test
    public void mergeTwoLists() {

        ListNode head1 = new ListNode(-9);
        head1.next = new ListNode(3);
        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(7);

        int[] expected = new int[]{-9, 3, 5, 7};
        int[] actual = new int[expected.length];
        ListNode result = mergeTwoSortedLists.mergeTwoLists(head1, head2);
        int i = 0;
        while (result != null){
            actual[i++] = result.val;
            result = result.next;
        }

        assertArrayEquals(expected, actual);


    }
}