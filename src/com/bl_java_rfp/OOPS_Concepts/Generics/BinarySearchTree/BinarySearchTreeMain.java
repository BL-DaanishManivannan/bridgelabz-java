package com.bl_java_rfp.OOPS_Concepts.Generics.BinarySearchTree;

// Main class to demonstrate BST creation and size validation
public class BinarySearchTreeMain {

    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        int[] nodes = {56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67};

        for (int key : nodes) {
            bst.add(key);
        }

        System.out.println("Size of BST: " + bst.size());
    }
}
