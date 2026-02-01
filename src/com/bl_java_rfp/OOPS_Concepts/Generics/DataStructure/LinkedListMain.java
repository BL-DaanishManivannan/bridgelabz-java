package com.bl_java_rfp.OOPS_Concepts.Generics.DataStructure;

// Main class to demonstrate deletion and size of LinkedList
public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(new Node(56));
        list.append(new Node(30));
        list.append(new Node(40));
        list.append(new Node(70));

        list.delete(40);

        list.display();
        System.out.println("LinkedList Size: " + list.size());
    }
}
