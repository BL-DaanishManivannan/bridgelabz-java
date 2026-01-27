package com.bl_java_rfp.basic_core_programs;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter power value N: ");
        int n = sc.nextInt();

        if (n < 0 || n >= 31) {
            System.out.println("Please enter N such that 0 <= N < 31");
            return;
        }

        for (int i = 0; i <= n; i++) {
            System.out.println("2^" + i + " = " + (1 << i));
        }
    }
}