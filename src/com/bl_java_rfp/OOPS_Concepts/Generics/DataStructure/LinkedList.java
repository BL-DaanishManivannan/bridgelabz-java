package com.bl_java_rfp.OOPS_Concepts.Generics.DataStructure;

// LinkedList class to manage node insertion and traversal
// Supports inserting a node after a given node
public class LinkedList {

    Node head;

    // Append node at the end (used for setup)
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

    // UC4: Insert node after given value
    public void insertAfter(int key, Node newNode) {
        Node temp = head;
        while (
