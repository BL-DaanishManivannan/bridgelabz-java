package com.bl_java_rfp.OOPS_Concepts.Generics.BinarySearchTree;

// Binary Search Tree implementation
// Supports add and size operations
public class BinarySearchTree<K extends Comparable<K>> {

    private BinaryNode<K> root;

    // Add key to BST
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

    // UC2: Get size of BST
    public int size() {
        return sizeRecursively(root);
    }

    private int sizeRecursively(BinaryNode<K> node) {
        if (node == null) {
            return 0;
        }
        return 1 + sizeRecursively(node.left) + sizeRecursively(node.right);
    }
}
