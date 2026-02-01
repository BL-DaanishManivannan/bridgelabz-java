package com.bl_java_rfp.OOPS_Concepts.Generics.DataStructure;

// Main class to demonstrate Ordered LinkedList
public class LinkedListMain {

    public static void main(String[] args) {

        SortedLinkedList<Integer> list = new SortedLinkedList<>();

        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);

        list.display();
    }
}
