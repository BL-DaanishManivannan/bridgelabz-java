package com.bl_java_rfp.OOPS_Concepts.Generics.HashTable;

// MyMapNode represents a key-value pair for HashTable
// Key stores the word and Value stores its frequency
public class MyMapNode<K, V> {

    K key;
    V value;
    MyMapNode<K, V> next;

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
