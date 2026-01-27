package com.bl_java_rfp.basic_core_programs;

import java.util.Scanner;

public class VowelConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().toLowerCase().charAt(0);

        if ("aeiou".indexOf(ch) != -1)
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}