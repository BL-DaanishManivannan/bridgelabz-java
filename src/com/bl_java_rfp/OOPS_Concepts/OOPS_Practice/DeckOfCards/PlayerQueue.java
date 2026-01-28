package com.bl_java_rfp.OOPS_Concepts.OOPS_Practice.DeckOfCards;

public class PlayerQueue {

    private Player[] queue;
    private int front;
    private int rear;
    private int capacity;

    public PlayerQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new Player[capacity];
        this.front = 0;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return rear < front;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public void enqueue(Player player) {
        if (isFull()) {
            System.out.println("Player queue is full");
            return;
        }
        queue[++rear] = player;
    }

    public Player dequeue() {
        if (isEmpty()) {
            System.out.println("Player queue is empty");
            return null;
        }
        return queue[front++];
    }
}
