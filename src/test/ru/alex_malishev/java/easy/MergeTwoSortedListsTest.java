package ru.alex_malishev.java.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {

    private MergeTwoSortedLists mergeTwoSortedLists;

    @Before
    public void setUp() throws Exception {
        mergeTwoSortedLists = new MergeTwoSortedLists();
    }

    @Test
    public void mergeTwoLists() {

        MergeTwoSortedLists.ListNode head1 = new MergeTwoSortedLists.ListNode(-9);
        head1.next = new MergeTwoSortedLists.ListNode(3);
//        head1.next.next = new MergeTwoSortedLists.ListNode();
        MergeTwoSortedLists.ListNode head2 = new MergeTwoSortedLists.ListNode(5);
        head2.next = new MergeTwoSortedLists.ListNode(7);
//        head2.next.next = new MergeTwoSortedLists.ListNode(4);

        int[] expected = new int[]{-9, 3, 5, 7};
        int[] actual = new int[expected.length];
        MergeTwoSortedLists.ListNode result = mergeTwoSortedLists.mergeTwoLists(head1, head2);
        int i = 0;
        while (result != null){
            actual[i++] = result.val;
            result = result.next;
        }

        assertArrayEquals(expected, actual);


    }
}