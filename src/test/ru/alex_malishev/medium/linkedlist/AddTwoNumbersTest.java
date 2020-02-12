package ru.alex_malishev.medium.linkedlist;

import org.junit.Before;
import org.junit.Test;
import ru.alex_malishev.base.linkedlist.LinkedListUtils;
import ru.alex_malishev.base.linkedlist.ListNode;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    private AddTwoNumbers mAddNumbers;

    @Before
    public void setUp() throws Exception {

        mAddNumbers = new AddTwoNumbers();
    }

    /**
     * Example 1:
     * Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 8 -> 0 -> 7
     */
    @Test
    public void addTwoNumbers() {

        int[] input1 = new int[]{7, 2, 4, 3};
        int[] input2 = new int[]{5, 6, 4};
        int[] output = new int[]{7, 8, 0, 7};

        ListNode l1 = LinkedListUtils.fillList(input1);
        ListNode l2 = LinkedListUtils.fillList(input2);

        assertArrayEquals(output, LinkedListUtils.toArray(mAddNumbers.addTwoNumbers(l1, l2)));

    }

    /**
     * Example 2:
     * Input: (7 -> 2 -> 4 -> 3) + (0)
     * Output: 7 -> 2 -> 4 -> 3
     */
    @Test
    public void addTwoNumbersExample2() {

        int[] input1 = new int[]{7, 2, 4, 3};
        int[] input2 = new int[]{0};
        int[] output = new int[]{7, 2, 4, 3};

        ListNode l1 = LinkedListUtils.fillList(input1);
        ListNode l2 = LinkedListUtils.fillList(input2);

        assertArrayEquals(output, LinkedListUtils.toArray(mAddNumbers.addTwoNumbers(l1, l2)));

    }

    /**
     * Example 3:
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 2 -> 4 -> 3
     */
    @Test
    public void addTwoNumbersExample3() {

        int[] input1 = new int[]{2, 4, 3};
        int[] input2 = new int[]{5, 6, 4};
        int[] output = new int[]{8, 0, 7};

        ListNode l1 = LinkedListUtils.fillList(input1);
        ListNode l2 = LinkedListUtils.fillList(input2);

        assertArrayEquals(output, LinkedListUtils.toArray(mAddNumbers.addTwoNumbers(l1, l2)));

    }

    /**
     * Example 4:
     * Input: (1) + (9 -> 9)
     * Output: 1 -> 0 -> 0
     */
    @Test
    public void addTwoNumbersExample4() {

        int[] input1 = new int[]{1};
        int[] input2 = new int[]{9, 9, 9};
        int[] output = new int[]{1, 0, 0, 0};

        ListNode l1 = LinkedListUtils.fillList(input1);
        ListNode l2 = LinkedListUtils.fillList(input2);

        assertArrayEquals(output, LinkedListUtils.toArray(mAddNumbers.addTwoNumbers(l1, l2)));

    }

    /**
     * Example 5:
     * Input: (9 -> 9) + (9)
     * Output: 1 -> 0 -> 8
     */
    @Test
    public void addTwoNumbersExample5() {

        int[] input1 = new int[]{9, 9};
        int[] input2 = new int[]{9};
        int[] output = new int[]{1, 0, 8};

        ListNode l1 = LinkedListUtils.fillList(input1);
        ListNode l2 = LinkedListUtils.fillList(input2);

        assertArrayEquals(output, LinkedListUtils.toArray(mAddNumbers.addTwoNumbers(l1, l2)));

    }

    /**
     * Example 6:
     * Input [6,4,5,0,4,4,9,4,1] + [3,8,8,0,3,0,1,4,8]
     * Output [1,0,3,3,0,7,5,0,8,9]
     */
    @Test
    public void addTwoNumbersExample6() {

        int[] input1 = new int[]{6,4,5,0,4,4,9,4,1};
        int[] input2 = new int[]{3,8,8,0,3,0,1,4,8};
        int[] output = new int[]{1,0,3,3,0,7,5,0,8,9};

        ListNode l1 = LinkedListUtils.fillList(input1);
        ListNode l2 = LinkedListUtils.fillList(input2);

        assertArrayEquals(output, LinkedListUtils.toArray(mAddNumbers.addTwoNumbers(l1, l2)));

    }
}