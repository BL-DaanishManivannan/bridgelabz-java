package com.bl_java_rfp.OOPS_Concepts.Generics.BinarySearchTree;

// Binary Search Tree implementation
// Supports add, size, and search operations
public class BinarySearchTree<K extends Comparable<K>> {

    private BinaryNode<K> root;

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

    public int size() {
        return sizeRecursively(root);
    }

    private int sizeRecursively(BinaryNode<K> node) {
        if (node == null) {
            return 0;
        }
        return 1 + sizeRecursively(node.left) + sizeRecursively(node.right);
    }

    // UC3: Search key in BST
    public boolean search(K key) {
        return searchRecursively(root, key);
    }

    private boolean searchRecursively(BinaryNode<K> current, K key) {
        if (current == null) {
            return false;
        }

        if (current.key.compareTo(key) == 0) {
            return true;
        }

        if (key.compareTo(current.key) < 0) {
            return searchRecursively(current.left, key);
        }

        return searchRecursively(current.right, key);
    }
}
