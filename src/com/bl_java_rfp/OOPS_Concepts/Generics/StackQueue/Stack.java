package com.bl_java_rfp.OOPS_Concepts.Generics.StackQueue;

// Stack implementation using LinkedList
// push operation internally uses LinkedList add method
public class Stack {

    private LinkedList list = new LinkedList();

    // UC1: Push element onto stack
    public void push(int data) {
        list.add(new Node(data));
    }

    public void display() {
        list.display();
    }
}
