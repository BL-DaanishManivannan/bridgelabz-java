package com.bl_java_rfp.OOPS_Concepts.Generics.DataStructure;

// LinkedList class to manage node operations
// Supports inserting a node after a searched value
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

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public void popLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public Node search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // UC8: Insert new node after given key
    public void insertAfter(int key, Node newNode) {
        Node current = search(key);
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
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
