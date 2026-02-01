package com.bl_java_rfp.OOPS_Concepts.Generics.DataStructure;

// Main class to demonstrate deletion of first node
public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(new Node(56));
        list.append(new Node(30));
        list.append(new Node(70));

        list.pop();

        list.display();
    }
}
