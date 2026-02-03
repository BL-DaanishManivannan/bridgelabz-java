package com.bl_java_rfp.OOPS_Concepts.DSA_Practice;

public class LinearSearchExample {

    // Linear Search method
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // target found
            }
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 23, 56, 89};
        int target = 23;

        int result = linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
