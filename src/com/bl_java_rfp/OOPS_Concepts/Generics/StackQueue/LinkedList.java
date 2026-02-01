package com.bl_java_rfp.OOPS_Concepts.Generics.StackQueue;

// LinkedList class used internally by Stack
// Supports add and remove operations at the beginning
public class LinkedList {

    Node head;

    // Add node at beginning
    public void add(Node newNode) {
        newNode.next = head;
        head = newNode;
    }

    // Remove node from beginning (Stack pop support)
    public Node remove() {
        if (head == null) {
            return null;
        }
        Node removedNode = head;
        head = head.next;
        return removedNode;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
