package com.bl_java_rfp.java_basic_programs.operators_problems;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int r1 = a + b * c;
        int r2 = c + a / b;
        int r3 = a % b + c;
        int r4 = a * b + c;

        int max = Math.max(Math.max(r1, r2), Math.max(r3, r4));
        int min = Math.min(Math.min(r1, r2), Math.min(r3, r4));

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}