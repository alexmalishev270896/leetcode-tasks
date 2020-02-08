package ru.alex_malishev.base.linkedlist;


import java.util.ArrayList;
import java.util.List;

public class LinkedListUtils {

    public static ListNode fillList(int[] input){
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

        return head;
    }

    public static ListNode getTail(ListNode node){
        while (node.next != null){
            node = node.next;
        }
        return node;
    }

    public static int[] toArray(ListNode node){
        List<Integer> list = new ArrayList<>();
        while (node != null){
            list.add(node.val);
            node = node.next;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
