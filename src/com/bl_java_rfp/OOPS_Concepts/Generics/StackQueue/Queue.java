package com.bl_java_rfp.OOPS_Concepts.Generics.StackQueue;

// Queue implementation using LinkedList
// Supports enqueue and dequeue operations
public class Queue {

    private LinkedList list = new LinkedList();

    public void enqueue(int data) {
        list.append(new Node(data));
    }

    // UC4: Dequeue element from front
    public int dequeue() {
        Node removed = list.remove();
        if (removed == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return removed.data;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        list.display();
    }
}
