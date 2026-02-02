package com.bl_java_rfp.OOPS_Concepts.Generics.BinarySearchTree;

// Interface for Binary Tree Node
// Ensures node key is comparable
public interface INode<K extends Comparable<K>> {
    K getKey();
}
