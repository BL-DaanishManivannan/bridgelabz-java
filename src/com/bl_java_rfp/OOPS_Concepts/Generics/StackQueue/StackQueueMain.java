package com.bl_java_rfp.OOPS_Concepts.Generics.StackQueue;

// Main class to demonstrate Queue creation
public class StackQueueMain {

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        queue.display();
    }
}
