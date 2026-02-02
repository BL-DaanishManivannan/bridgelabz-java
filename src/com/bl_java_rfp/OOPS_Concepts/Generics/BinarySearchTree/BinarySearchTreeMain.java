package com.bl_java_rfp.OOPS_Concepts.Generics.BinarySearchTree;

// Main class to demonstrate search operation in BST
public class BinarySearchTreeMain {

    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        int[] nodes = {56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67};

        for (int key : nodes) {
            bst.add(key);
        }

        int searchKey = 63;
        boolean found = bst.search(searchKey);

        System.out.println("Is " + searchKey + " present in BST? " + found);
    }
}
