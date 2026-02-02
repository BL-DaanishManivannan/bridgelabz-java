package com.bl_java_rfp.OOPS_Concepts.Generics.HashTableBST;

// Main class to demonstrate removal of a word from HashTable
public class HashTableBSTMain {

    public static void main(String[] args) {

        String paragraph =
                "Paranoids are not paranoid because they are paranoid but " +
                        "because they keep putting themselves deliberately into " +
                        "paranoid avoidable situations";

        String[] words = paragraph.toLowerCase().split(" ");

        MyHashTable<String, Integer> hashTable = new MyHashTable<>();

        for (String word : words) {
            Integer count = hashTable.get(word);
            if (count == null) {
                hashTable.put(word, 1);
            } else {
                hashTable.put(word, count + 1);
            }
        }

        // UC3: Remove the word "avoidable"
        hashTable.remove("avoidable");

        hashTable.display();
    }
}
