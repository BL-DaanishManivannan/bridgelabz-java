package com.bl_java_rfp.OOPS_Concepts.Generics.BinarySearchTree;

// Binary Search Tree implementation
// Supports adding nodes to BST
public class BinarySearchTree<K extends Comparable<K>> {

    private BinaryNode<K> root;

    // UC1: Add key to BST
    public void add(K key) {
        root = addRecursively(root, key);
    }

    private BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
        if (current == null) {
            return new BinaryNode<>(key);
        }

        if (key.compareTo(current.key) < 0) {
            current.left = addRecursively(current.left, key);
        } else if (key.compareTo(current.key) > 0) {
            current.right = addRecursively(current.right, key);
        }

        return current;
    }
}
