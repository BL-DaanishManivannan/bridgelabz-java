package com.bl_java_rfp.OOPS_Concepts.Generics.HashTableBST;

// LinkedList implementation to store MyMapNode elements
// Used internally for HashTable operations
public class MyLinkedList<K, V> {

    private MyMapNode<K, V> head;

    // Add or update key-value pair
    public void add(K key, V value) {
        MyMapNode<K, V> current = head;

        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        MyMapNode<K, V> newNode = new MyMapNode<>(key, value);
        newNode.next = head;
        head = newNode;
    }

    // Get value by key
    public V get(K key) {
        MyMapNode<K, V> current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void display() {
        MyMapNode<K, V> current = head;
        while (current != null) {
            System.out.println(current.key + " : " + current.value);
            current = current.next;
        }
    }
}
