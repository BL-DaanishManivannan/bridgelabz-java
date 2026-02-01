package com.bl_java_rfp.OOPS_Concepts.Generics.DataStructure;

// Main class to demonstrate adding nodes at the beginning
public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push(new Node(70));
        list.push(new Node(30));
        list.push(new Node(56));

        list.display();
    }
}
