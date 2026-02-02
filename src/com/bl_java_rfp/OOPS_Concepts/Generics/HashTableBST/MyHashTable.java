package com.bl_java_rfp.OOPS_Concepts.Generics.HashTableBST;

// Custom HashTable implementation using LinkedList buckets
public class MyHashTable<K, V> {

    private final int SIZE = 10;
    private MyLinkedList<K, V>[] buckets;

    @SuppressWarnings("unchecked")
    public MyHashTable() {
        buckets = new MyLinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new MyLinkedList<>();
        }
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        buckets[index].add(key, value);
    }

    public V get(K key) {
        int index = getIndex(key);
        return buckets[index].get(key);
    }

    // UC3: Remove key from HashTable
    public void remove(K key) {
        int index = getIndex(key);
        buckets[index].remove(key);
    }

    public void display() {
        for (MyLinkedList<K, V> bucket : buckets) {
            bucket.display();
        }
    }
}
