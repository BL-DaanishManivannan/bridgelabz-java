package com.bl_java_rfp.OOPS_Concepts.Generics.BinarySearchTree;

// BinaryNode represents each node in the BST
public class BinaryNode<K extends Comparable<K>> implements INode<K> {

    K key;
    BinaryNode<K> left;
    BinaryNode<K> right;

    public BinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    @Override
    public K getKey() {
        return key;
    }
}
