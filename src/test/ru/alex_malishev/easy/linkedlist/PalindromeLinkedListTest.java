package ru.alex_malishev.easy.linkedlist;

import org.junit.Before;
import org.junit.Test;
import ru.alex_malishev.base.linkedlist.ListNode;

import static org.junit.Assert.*;

public class PalindromeLinkedListTest {

    private PalindromeLinkedList mPalindrome;

    @Before
    public void setUp() throws Exception {
        mPalindrome = new PalindromeLinkedList();
    }

    /**
     * Example 1:
     * Input: 1->2
     * Output: false
     */
    @Test
    public void isPalindromeExample1() {
        int[] input = new int[]{1, 2};
        ListNode head = null;
        ListNode tail = null;
        int i = 0;
        while (i < input.length){
            if (head == null){
                head = new ListNode(input[i]);
                tail = head;
            }else {
                tail.next = new ListNode(input[i]);
                tail = tail.next;
            }
            i++;
        }

        assertFalse(mPalindrome.isPalindrome(head));
    }

    /**
     * Example 2:
     * Input: 1->2->2->1
     * Output: true
     */
    @Test
    public void isPalindromeExample2() {
        int[] input = new int[]{1, 2, 2, 1};
        ListNode head = null;
        ListNode tail = null;
        int i = 0;
        while (i < input.length){
            if (head == null){
                head = new ListNode(input[i]);
                tail = head;
            }else {
                tail.next = new ListNode(input[i]);
                tail = tail.next;
            }
            i++;
        }

        assertTrue(mPalindrome.isPalindrome(head));
    }

    /**
     * Example 3:
     * Input: 1
     * Output: true
     */
    @Test
    public void isPalindromeExample3() {
        assertTrue(mPalindrome.isPalindrome(new ListNode(1)));
    }

    /**
     * Example 4:
     * Input: null
     * Output: true
     */
    @Test
    public void isPalindromeExample4() {
        assertTrue(mPalindrome.isPalindrome(null));
    }

    /**
     * Example 5:
     * Input: 1->2->3->2->1
     * Output: true
     */
    @Test
    public void isPalindromeExample5() {
        int[] input = new int[]{1, 2, 3, 2, 1};
        ListNode head = null;
        ListNode tail = null;
        int i = 0;
        while (i < input.length){
            if (head == null){
                head = new ListNode(input[i]);
                tail = head;
            }else {
                tail.next = new ListNode(input[i]);
                tail = tail.next;
            }
            i++;
        }

        assertTrue(mPalindrome.isPalindrome(head));
    }
}