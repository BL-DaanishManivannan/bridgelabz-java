package com.bl_java_rfp.java_basic_programs.forloop_problems;

import java.util.Scanner;

public class ReverseFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int reverse = 0;

        for (; n != 0; n /= 10) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println("Reverse = " + reverse);
    }
}