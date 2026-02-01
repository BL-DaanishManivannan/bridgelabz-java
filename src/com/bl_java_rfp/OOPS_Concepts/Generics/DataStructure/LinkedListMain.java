package com.bl_java_rfp.OOPS_Concepts.Generics.DataStructure;

// Main class to demonstrate searching in LinkedList
public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(new Node(56));
        list.append(new Node(30));
        list.append(new Node(70));

        Node result = list.search(30);

        if (result != null) {
            System.out.println("Node found with value: " + result.data);
        } else {
            System.out.println("Node not found");
        }

        list.display();
    }
}
