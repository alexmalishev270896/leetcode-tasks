package ru.alex_malishev.easy.linkedlist;


import ru.alex_malishev.base.linkedlist.ListNode;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 * Example 1:
 * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 * Output: Reference of the node with value = 8
 * Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
 * From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,0,1,8,4,5].
 * There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
 *
 *Example 2:
 * Input: intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
 * Output: Reference of the node with value = 2
 * Input Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect).
 * From the head of A, it reads as [0,9,1,2,4]. From the head of B, it reads as [3,2,4].
 * There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
 *
 *
 * Example 3:
 * Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
 * Output: null
 * Input Explanation: From the head of A, it reads as [2,6,4].
 * From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0,
 * while skipA and skipB can be arbitrary values.
 * Explanation: The two lists do not intersect, so return null.
 *
 *
 * Notes:
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 *
 * Solution.
 * 1. Iterate through all linked list and determine their sizes
 * 2. Find the difference between two sizes. The difference will be the index of bigger linked list node, from which we
 * will start new iteration.
 * 3. Start new iteration until references of next nodes from linked lists will be equals or the end of the list will be riched.
 */
public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB) return headA;
        if (headA == null || headB == null) return null;
        ListNode node1 = headA;
        ListNode node2 = headB;
        int sizeA = 1;
        int sizeB = 1;
        while (headA != null){
            headA = headA.next;
            sizeA++;
        }
        while (headB != null){
            headB = headB.next;
            sizeB++;
        }
        int index = Math.abs(sizeA - sizeB);
        int i = 0;
        if (sizeA > sizeB){
            while (i < index){
                node1 = node1.next;
                i++;
            }
        } else {
            while (i < index){
                node2 = node2.next;
                i++;
            }
        }

        while (node1 != null && node2 != null){
            if (node1 == node2) return node1;
            if (node1.next == node2.next) return node1.next;
            if (node1.next == null || node2.next == null) return null;
            node1 = node1.next;
            node2 = node2.next;
        }
        return null;
    }
}
