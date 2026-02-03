package com.bl_java_rfp.OOPS_Concepts.DSA_Practice;

import java.util.Arrays;

public class InsertionSortEmployeeIDs {

    // Insertion Sort method
    public static void insertionSort(int[] employeeIds) {
        int n = employeeIds.length;

        for (int i = 1; i < n; i++) {
            int key = employeeIds[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                j--;
            }

            employeeIds[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] employeeIds = {1045, 1021, 1090, 1003, 1067};

        insertionSort(employeeIds);

        System.out.println("Sorted Employee IDs: " + Arrays.toString(employeeIds));
    }
}
