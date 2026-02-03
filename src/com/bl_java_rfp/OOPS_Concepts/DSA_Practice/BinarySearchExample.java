package com.bl_java_rfp.OOPS_Concepts.DSA_Practice;

public class BinarySearchExample {

    // Binary Search method (Iterative)
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // avoids overflow

            if (arr[mid] == target) {
                return mid; // target found
            } else if (arr[mid] < target) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] numbers = {5, 12, 18, 23, 45, 56, 89}; // must be sorted
        int target = 23;

        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
