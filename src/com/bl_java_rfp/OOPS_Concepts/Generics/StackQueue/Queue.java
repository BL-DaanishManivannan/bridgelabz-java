package com.bl_java_rfp.OOPS_Concepts.Generics.StackQueue;

// Queue implementation using LinkedList
// enqueue adds elements at the end (FIFO order)
public class Queue {

    private LinkedList list = new LinkedList();

    // UC3: Enqueue element
    public void enqueue(int data) {
        list.append(new Node(data));
    }

    public void display() {
        list.display();
    }
}
