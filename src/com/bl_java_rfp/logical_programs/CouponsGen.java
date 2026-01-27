package com.bl_java_rfp.logical_programs;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CouponsGen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter number of distinct coupons: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }

        Set<Integer> coupons = new HashSet<>();
        int totalRandomNumbers = 0;

        while (coupons.size() < n) {
            int coupon = random.nextInt(n);
            coupons.add(coupon);
            totalRandomNumbers++;
        }

        System.out.println("Total random numbers needed: " + totalRandomNumbers);
    }
}