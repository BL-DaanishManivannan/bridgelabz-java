package com.bl_java_rfp.OOPS_Concepts.Generics.DataStructure;

// LinkedList class to manage node insertion and traversal
// Supports adding nodes at beginning and displaying the list
public class LinkedList {

    Node head;

    // UC2: Add node at the beginning
    public void push(Node newNode) {
        newNode.next = head;
        head = newNode;
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
