package ru.alex_malishev.medium.linkedlist;

import ru.alex_malishev.base.linkedlist.ListNode;

import java.util.*;

/**
 * We are given a linked list with head as the first node.  Let's number the nodes in the list: node_1, node_2, node_3, ... etc.
 *
 * Each node may have a next larger value: for node_i, next_larger(node_i) is the node_j.val such that j > i,
 * node_j.val > node_i.val, and j is the smallest possible choice.  If such a j does not exist, the next larger value is 0.
 *
 * Return an array of integers answer, where answer[i] = next_larger(node_{i+1}).
 *
 * Note that in the example inputs (not outputs) below, arrays such as [2,1,5] represent the serialization of
 * a linked list with a head node value of 2, second node value of 1, and third node value of 5.
 *
 * Example 1:
 *
 * Input: [2,1,5]
 * Output: [5,5,0]
 * Example 2:
 *
 * Input: [2,7,4,3,5]
 * Output: [7,0,5,5,0]
 * Example 3:
 *
 * Input: [1,7,5,1,9,2,5,1]
 * Output: [7,9,9,9,0,5,0,0]
 *
 *
 * Note:
 *
 * 1 <= node.val <= 10^9 for each node in the linked list.
 * The given list has length in the range [0, 10000].
 */
public class NextGreaterNodeInLinkedList {


    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null){
            ListNode node = head;
            while (node.next != null){
                node = node.next;
                if (node.val > head.val){
                    list.add(node.val);
                    break;
                }
            }
            if (node.val == head.val) list.add(0);
            head = head.next;
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public int[] nextLargerNodesStack(ListNode head){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int index = 0;

        while (head != null){
            list.add(head.val);
            while (!stack.isEmpty() && list.get(stack.peek()) < head.val){
                list.set(stack.pop(), head.val);
            }

            stack.push(index);
            index++;
            head = head.next;
        }

        while (!stack.isEmpty()){
            list.set(stack.pop(), 0);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;

    }
}
