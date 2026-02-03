package com.bl_java_rfp.OOPS_Concepts.DSA_Practice;

import java.util.Arrays;

public class BubbleSortStudentMarks {

    // Bubble Sort method
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // swap
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: stop if already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] studentMarks = {78, 45, 90, 62, 88, 50};

        bubbleSort(studentMarks);

        System.out.println("Sorted Student Marks: " + Arrays.toString(studentMarks));
    }
}
