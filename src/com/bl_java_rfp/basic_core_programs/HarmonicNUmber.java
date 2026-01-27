package com.bl_java_rfp.basic_core_programs;

import java.util.Scanner;

public class HarmonicNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println("Harmonic Value: " + sum);
    }
}