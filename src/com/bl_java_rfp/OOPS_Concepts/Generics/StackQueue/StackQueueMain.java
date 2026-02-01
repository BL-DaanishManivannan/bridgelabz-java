package com.bl_java_rfp.OOPS_Concepts.Generics.StackQueue;

// Main class to demonstrate peek and pop operations on Stack
public class StackQueueMain {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println("Top element (peek): " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
