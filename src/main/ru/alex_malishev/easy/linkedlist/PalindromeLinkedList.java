package ru.alex_malishev.easy.linkedlist;

import ru.alex_malishev.base.linkedlist.ListNode;

import java.util.Stack;

/**
 * Given a singly linked list, determine if it is a palindrome.
 *
 * Example 1:
 * Input: 1->2
 * Output: false
 *
 * Example 2:
 * Input: 1->2->2->1
 * Output: true
 *
 * Example 3:
 * Input: 1
 * Output: true
 *
 * Example 4:
 * Input: null
 * Output: true
 *
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 *
 * Solution:
 * 1. Determine the middle of LinkedList using two pointers (slow and fast)
 * 2. Put values of slow pointer to Stack while iterating through list using two pointers (also compute linked list size)
 * 3. If linked list size is odd pop element from stack, otherwise do nothing
 * 4. Continue the iteration and compare popped values from stack with value of current node
 * 5. If compared values are not equals finish the iteration and return false, otherwise continue and if stack is empty return true
 */
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        Stack<Integer> stack = new Stack<>();
        ListNode slowNode = head;
        ListNode fastNode = head.next;
        int size = 2;
        while (fastNode != null){
            stack.push(slowNode.val);
            slowNode = slowNode.next;
            if (fastNode.next != null) size++;
            if (fastNode.next != null && fastNode.next.next != null) size++;
            fastNode = fastNode.next != null ? fastNode.next.next : null;
        }
        if (size == 2){
            return slowNode.val == stack.pop();
        } else if (size % 2 != 0) {
            slowNode = slowNode.next;
        }

        while (slowNode != null){
            if (stack.pop() != slowNode.val) return false;
            slowNode = slowNode.next;
        }
        return true;
    }
}
