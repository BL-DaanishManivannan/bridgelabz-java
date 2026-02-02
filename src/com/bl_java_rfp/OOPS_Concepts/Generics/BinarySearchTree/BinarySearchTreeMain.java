package com.bl_java_rfp.OOPS_Concepts.Generics.BinarySearchTree;

// Main class to demonstrate BST creation
public class BinarySearchTreeMain {

    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.add(56);
        bst.add(30);
        bst.add(70);

        System.out.println("BST created with root 56, left 30, right 70");
    }
}
