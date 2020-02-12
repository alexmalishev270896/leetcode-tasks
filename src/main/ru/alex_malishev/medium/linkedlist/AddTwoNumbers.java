package ru.alex_malishev.medium.linkedlist;

import ru.alex_malishev.base.linkedlist.ListNode;

import java.util.Stack;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The most significant digit comes first and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Follow up:
 * What if you cannot modify the input lists? In other words, reversing the lists is not allowed.
 * <p>
 * Example:
 * <p>
 * Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 8 -> 0 -> 7
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.val == 0)return l2;
        if (l2.val == 0) return l1;
        ListNode resultHead = null;
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while (l1 != null){
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null){
            s2.push(l2.val);
            l2 = l2.next;
        }

        int supl = 0;
        while (!s1.isEmpty() && !s2.isEmpty()){
            int val = s1.pop() + s2.pop() + supl;
            int newVal = val;
            if (newVal >= 10){
                newVal -= 10;
            }
            if (resultHead == null){
                resultHead = new ListNode(newVal);
            }else {
                ListNode node = new ListNode(newVal);
                node.next = resultHead;
                resultHead = node;
            }
            supl = val >= 10 ? 1 : 0;
        }

        while (!s1.isEmpty()){
            int newVal = s1.pop() + supl;
            ListNode node = new ListNode(newVal >= 10 ? newVal - 10 : newVal);
            node.next = resultHead;
            resultHead = node;
            supl = newVal >= 10 ? 1 : 0;
        }

        while (!s2.isEmpty()){
            int newVal = s2.pop() + supl;
            ListNode node = new ListNode(newVal >= 10 ? newVal - 10 : newVal);
            node.next = resultHead;
            resultHead = node;
            supl = newVal >= 10 ? 1 : 0;
        }

        if (supl == 1){
            ListNode node = new ListNode(1);
            node.next = resultHead;
            resultHead = node;
        }
        return resultHead;
    }
}
