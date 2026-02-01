package com.bl_java_rfp.OOPS_Concepts.Generics.StackQueue;

// LinkedList class used internally by Stack and Queue
// Supports add at beginning, append at end, and remove from beginning
public class LinkedList {

    Node head;

    // Add node at beginning (Stack push)
    public void add(Node newNode) {
        newNode.next = head;
        head = newNode;
    }

    // Append node at end (Queue enqueue)
    public void append(Node newNode) {
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Remove node from beginning (Stack pop / Queue dequeue)
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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
