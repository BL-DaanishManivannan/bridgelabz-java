package com.bl_java_rfp.OOPS_Concepts.Generics.DataStructure;

// SortedLinkedList maintains elements in ascending order
// Uses Comparable to insert elements in sorted position
public class SortedLinkedList<T extends Comparable<T>> {

    private Node<T> head;

    // Add data in sorted order
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        // Case 1: Empty list OR insert at beginning
        if (head == null || head.data.compareTo(data) > 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Case 2: Insert in middle or end
        Node<T> current = head;
        while (current.next != null &&
                current.next.data.compareTo(data) < 0) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void display() {
        Node<T> temp = head;
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
