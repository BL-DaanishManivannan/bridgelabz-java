package com.bl_java_rfp.java_basic_programs.forloop_problems;

import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;
        int reverse = 0;

        for (; n != 0; n /= 10) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
        }

        if (original == reverse)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome");
    }
}
