package com.bl_java_rfp.OOPS_Concepts.Generics.HashTableBST;

// Main class to demonstrate word frequency using HashTable
public class HashTableBSTMain {

    public static void main(String[] args) {

        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split(" ");

        MyLinkedList<String, Integer> list = new MyLinkedList<>();

        for (String word : words) {
            Integer count = list.get(word);
            if (count == null) {
                list.add(word, 1);
            } else {
                list.add(word, count + 1);
            }
        }

        list.display();
    }
}
