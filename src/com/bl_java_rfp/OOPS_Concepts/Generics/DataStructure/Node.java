package com.bl_java_rfp.OOPS_Concepts.Generics.DataStructure;

// Generic Node class for LinkedList
// Stores comparable data and reference to next node
public class Node<T extends Comparable<T>> {

    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
