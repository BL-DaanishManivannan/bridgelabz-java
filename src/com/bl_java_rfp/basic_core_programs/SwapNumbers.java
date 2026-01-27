package com.bl_java_rfp.basic_core_programs;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swap: a=" + a + ", b=" + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap: a=" + a + ", b=" + b);
    }
}
