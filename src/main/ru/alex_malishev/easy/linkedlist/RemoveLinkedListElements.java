package ru.alex_malishev.easy.linkedlist;

import ru.alex_malishev.base.linkedlist.ListNode;

/**
 * Remove all elements from a linked list of integers that have value val.
 *
 * Example 1:
 *
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 *
 * Example 2:
 *
 * Input:  1->1, val = 1
 * Output: null
 *
 * Example 3:
 *
 * Input:  null, val = 0
 * Output: null
 *
 *
 * Example 4:
 *
 * Input:  1->2->3->4->5->6, val = 10
 * Output: 1->2->3->4->5->6
 * Solution:
 *
 * 1. Define variable to store previously visited LinkedList node
 * 2. Iterate through list - if current node val equals val delete current node, otherwise update previously visited node variable
 * 3. Return a head of new linked list
 */
public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode newHead = head;
        ListNode lastVisited = null;
        while (head != null){
            if (head.val == val){
                if (lastVisited != null){
                    lastVisited.next = head.next;
                }else {
                    newHead = head.next;
                }
            }else {
                lastVisited = head;
            }
            head = head.next;

        }
        return newHead;
    }
}
