package com.bl_java_rfp.basic_core_programs;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n % 2 == 0 ? "Even" : "Odd");
    }
}
