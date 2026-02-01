package com.bl_java_rfp.OOPS_Concepts.Generics.DataStructure;

// Main class to demonstrate LinkedList creation
// Initializes LinkedList and adds sample data
public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(new Node(56));
        list.add(new Node(30));
        list.add(new Node(70));

        list.display();
    }
}
