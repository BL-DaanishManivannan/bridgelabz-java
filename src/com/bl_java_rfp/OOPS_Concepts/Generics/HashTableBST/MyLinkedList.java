package com.bl_java_rfp.OOPS_Concepts.Generics.HashTableBST;

// LinkedList implementation to store MyMapNode elements
// Supports add, get, remove operations
public class MyLinkedList<K, V> {

    private MyMapNode<K, V> head;

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

    // UC3: Remove node by key
    public void remove(K key) {
        if (head == null) return;

        if (head.key.equals(key)) {
            head = head.next;
            return;
        }

        MyMapNode<K, V> current = head;
        while (current.next != null) {
            if (current.next.key.equals(key)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void display() {
        MyMapNode<K, V> current = head;
        while (current != null) {
            System.out.println(current.key + " : " + current.value);
            current = current.next;
        }
    }
}
