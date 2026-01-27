package com.bl_java_rfp.logical_programs;

import java.util.Scanner;

public class Fibanacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }

        int first = 0, second = 1;

        if (n >= 1) {
            System.out.print(first + " ");
        }

        if (n >= 2) {
            System.out.print(second + " ");
        }

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
