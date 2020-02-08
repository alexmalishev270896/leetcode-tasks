package ru.alex_malishev.easy.linkedlist;

import org.junit.Before;
import org.junit.Test;
import ru.alex_malishev.base.linkedlist.LinkedListUtils;
import ru.alex_malishev.base.linkedlist.ListNode;

import static org.junit.Assert.*;

public class IntersectionOfTwoLinkedListsTest {

    private IntersectionOfTwoLinkedLists mIntersection;

    @Before
    public void setUp() throws Exception {

        mIntersection = new IntersectionOfTwoLinkedLists();
    }

    /**
     * Example 1:
     * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
     * Output: Reference of the node with value = 8
     */
    @Test
    public void getIntersectionNodeExample1() {
        int[] input1 = new int[]{4, 1};
        int[] input2 = new int[]{5, 0};
        int[] intersection = new int[]{8, 4, 5};
        ListNode head1 = LinkedListUtils.fillList(input1);
        ListNode head2 = LinkedListUtils.fillList(input2);
        ListNode head3 = LinkedListUtils.fillList(intersection);
        LinkedListUtils.getTail(head1).next = head3;
        LinkedListUtils.getTail(head2).next = head3;
        ListNode result = mIntersection.getIntersectionNode(head1, head2);
        assertNotNull(result);
        assertEquals(8, result.val);
    }

    /**
     * Example 2:
     * Input: intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
     * Output: Reference of the node with value = 2
     */
    @Test
    public void getIntersectionNodeExample2() {
        int[] input1 = new int[]{0, 9, 1};
        int[] input2 = new int[]{3};
        int[] intersection = new int[]{2, 4};
        ListNode head1 = LinkedListUtils.fillList(input1);
        ListNode head2 = LinkedListUtils.fillList(input2);
        ListNode head3 = LinkedListUtils.fillList(intersection);
        LinkedListUtils.getTail(head1).next = head3;
        LinkedListUtils.getTail(head2).next = head3;


        ListNode result = mIntersection.getIntersectionNode(head1, head2);
        assertNotNull(result);
        assertEquals(2, result.val);
    }

    /**
     * Example 3:
     * Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
     * Output: null
     */
    @Test
    public void getIntersectionNodeExample3() {
        int[] input1 = new int[]{2, 6, 4};
        int[] input2 = new int[]{1, 5};
        ListNode head1 = LinkedListUtils.fillList(input1);
        ListNode head2 = LinkedListUtils.fillList(input2);

        assertNull( mIntersection.getIntersectionNode(head1, head2));
    }

    /**
     * Example 4:
     * Input: intersectVal = 0, listA = [], listB = [1,5]
     * Output: null
     */
    @Test
    public void getIntersectionNodeExample4() {
        int[] input2 = new int[]{1, 5};
        ListNode head2 = LinkedListUtils.fillList(input2);
        assertNull( mIntersection.getIntersectionNode(null, head2));
    }
}