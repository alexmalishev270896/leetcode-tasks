package ru.alex_malishev.java.easy;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedLists {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = null;
        ListNode tail = null;
        while (l1 != null || l2 != null) {
            ListNode node;
            if (l1 != null && (l2 == null || (l1.val < l2.val))){
                node = new ListNode(l1.val);
                l1 = l1.next;
            }else {
                node = new ListNode(l2.val);
                l2 = l2.next;
            }

            if (head == null){
                head = node;
                tail = head;
            }else {
                tail.next = node;
                tail = tail.next;
            }
        }

        return head;
    }
}
