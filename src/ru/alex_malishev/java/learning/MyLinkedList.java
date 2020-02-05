package ru.alex_malishev.java.learning;

public class MyLinkedList {
    private int mSize = 0;
    private ListNode mHead = null;
    private ListNode mTail = null;

    public static class ListNode {
        int val;
        ListNode prev = null;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || index >= mSize) return -1;
        ListNode node = getNodeAt(index);
        return node.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        if (mHead == null) {
            mHead = newNode;
            mTail = mHead;
        } else {
            newNode.next = mHead;
            mHead.prev = newNode;
            mHead = newNode;
        }
        mSize++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        if (mTail == null) {
            mTail = newNode;
            mHead = mTail;
        } else {
            mTail.next = newNode;
            newNode.prev = mTail;
            mTail = newNode;
        }
        mSize++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > mSize) return;
        if (index - 1 < 0) {
            addAtHead(val);
            return;
        } else if (index == mSize) {
            addAtTail(val);
            return;
        }else {
            ListNode node = getNodeAt(index - 1);
            if (node == mTail){
                addAtTail(val);
            }else {
                ListNode newNode = new ListNode(val);
                newNode.next = node.next;
                node.next.prev = newNode;
                newNode.prev = node;
                node.next = newNode;
            }
        }
        mSize++;

    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= mSize) return;
        if (mSize == 1) {
            mTail = null;
            mHead = null;
        } else {
            ListNode deleteNode = getNodeAt(index);
            if (deleteNode.prev != null) {
                deleteNode.prev.next = deleteNode.next;
                if (deleteNode.next != null) {
                    deleteNode.next.prev = deleteNode.prev;
                }else {
                    mTail = deleteNode.prev;
                    mTail.next = null;
                }
            }else {
                mHead = deleteNode.next;
            }

        }
        mSize--;
    }

    private ListNode getNodeAt(int index) {
        int i = 0;
        ListNode node;
        if (index > mSize / 2) {
            node = mTail;
            while (i < mSize - index - 1) {
                node = node.prev;
                i++;
            }
        } else {
            node = mHead;
            while (i < index) {
                node = node.next;
                i++;
            }

        }
        return node;

    }
}