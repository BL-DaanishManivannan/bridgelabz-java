package com.bl_java_rfp.OOPS_Concepts.Generics.StackQueue;

// LinkedList class used internally by Stack
// Supports adding elements at the beginning
public class LinkedList {

    Node head;

    // Add node at beginning (Stack push support)
    public void add(Node newNode) {
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
