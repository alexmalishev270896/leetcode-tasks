package ru.alex_malishev.easy.linkedlist;

import ru.alex_malishev.base.linkedlist.ListNode;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * Example 1:
 * Input: 1->1->2
 * Output: 1->2
 *
 * Example 2:
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 *
 * Example 3:
 * Input: -1->-1->0->2->2->3->10->10->20
 * Output: -1->0->2->3->10->20
 *
 * Example 4:
 * Input: null
 * Output: null
 *
 * Solution:
 * 1. Define variable to store last visited node
 * 2. Iterate through LinkedList
 *      - if last visited node value equals current node value then delete current value
 * 3. Return head node
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode newHead = head;
        ListNode lastVisited = newHead;
        head = head.next;
        while (head != null){
            if (lastVisited.val == head.val){
                lastVisited.next = head.next;
            }else {
                lastVisited = head;
            }
            head = head.next;
        }
        return newHead;
    }
}
