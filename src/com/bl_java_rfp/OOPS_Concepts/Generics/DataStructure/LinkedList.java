package com.bl_java_rfp.OOPS_Concepts.Generics.DataStructure;

// Generic LinkedList implementation
// Supports search, insert, delete, and size operations
public class LinkedList<T extends Comparable<T>> {

    Node<T> head;

    public void append(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Search node by key
    public Node<T> search(T key) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.compareTo(key) == 0) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Insert after a given key
    public void insertAfter(T key, T newData) {
        Node<T> current = search(key);
        if (current != null) {
            Node<T> newNode = new Node<>(newData);
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Delete node by key
    public void delete(T key) {
        if (head == null) return;

        if (head.data.compareTo(key) == 0) {
            head = head.next;
            return;
        }

        Node<T> temp = head;
        while (temp.next != null) {
            if (temp.next.data.compareTo(key) == 0) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    // Get size of LinkedList
    public int size() {
        int count = 0;
        Node<T> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
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
