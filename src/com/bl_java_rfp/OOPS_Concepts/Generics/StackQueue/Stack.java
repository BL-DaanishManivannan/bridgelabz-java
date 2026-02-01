package com.bl_java_rfp.OOPS_Concepts.Generics.StackQueue;

// Stack implementation using LinkedList
// Supports push, peek, and pop operations
public class Stack {

    private LinkedList list = new LinkedList();

    public void push(int data) {
        list.add(new Node(data));
    }

    // UC2: Peek top element
    public int peek() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return list.head.data;
    }

    // UC2: Pop top element
    public int pop() {
        Node removed = list.remove();
        if (removed == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return removed.data;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
