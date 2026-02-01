package com.bl_java_rfp.OOPS_Concepts.Generics.DataStructure;

// LinkedList class to manage node insertion and deletion
// Supports deleting the first node (pop operation)
public class LinkedList {

    Node head;

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

    // UC5: Remove first element
    public void pop() {
        if (head != null) {
            head = head.next;
        }
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
