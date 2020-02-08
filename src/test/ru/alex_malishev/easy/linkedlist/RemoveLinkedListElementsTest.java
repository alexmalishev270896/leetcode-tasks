package ru.alex_malishev.easy.linkedlist;

import org.junit.Before;
import org.junit.Test;
import ru.alex_malishev.base.linkedlist.LinkedListUtils;
import ru.alex_malishev.base.linkedlist.ListNode;

import static org.junit.Assert.*;

public class RemoveLinkedListElementsTest {

    private RemoveLinkedListElements mRemoveElements;

    @Before
    public void setUp() throws Exception {
        mRemoveElements = new RemoveLinkedListElements();
    }

    /**
     * Example 1:
     * <p>
     * Input:  1->2->6->3->4->5->6, val = 6
     * Output: 1->2->3->4->5
     */
    @Test
    public void removeElementsExample1() {
        int[] input = new int[]{1, 2, 6, 3, 4, 5, 6};
        int[] output = new int[]{1, 2, 3, 4, 5};
        int val = 6;
        ListNode head = LinkedListUtils.fillList(input);
        ListNode newHead = mRemoveElements.removeElements(head, val);
        assertArrayEquals(output, LinkedListUtils.toArray(newHead));
    }

    /**
     * Example 2:
     * <p>
     * Input:  1->1, val = 1
     * Output: null
     */
    @Test
    public void removeElementsExample2() {
        int[] input = new int[]{1, 1};
        int val = 1;
        ListNode head = LinkedListUtils.fillList(input);
        assertNull(mRemoveElements.removeElements(head, val));
    }

    /**
     * Example 3:
     * <p>
     * Input:  null, val = 0
     * Output: null
     */
    @Test
    public void removeElementsExample3() {
        assertNull(mRemoveElements.removeElements(null, 0));
    }

    /**
     * Example 4:
     * <p>
     * Input:  1->2->3->4->5->6, val = 10
     * Output: 1->2->3->4->5->6
     */
    @Test
    public void removeElementsExample4() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        int[] output = new int[]{1, 2, 3, 4, 5, 6};
        int val = 10;
        ListNode head = LinkedListUtils.fillList(input);
        ListNode newHead = mRemoveElements.removeElements(head, val);
        assertArrayEquals(output, LinkedListUtils.toArray(newHead));
    }
}