package com.bl_java_rfp.basic_core_programs;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        System.out.println("Quotient: " + dividend / divisor);
        System.out.println("Remainder: " + dividend % divisor);
    }
}