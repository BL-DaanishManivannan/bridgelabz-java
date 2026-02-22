package com.bl_java_rfp.Java8.Streams;

import java.util.Arrays;
import java.util.List;

/**
 * UC0 → UC2.1
 */
public class StreamApiMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Java 8 Streams API Program");

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Initial Numbers: " + numbers);

        // ===== UC2.1 =====
        System.out.println("\nUC2.1: Iterate using stream.forEach");

        numbers.stream()
                .forEach(number -> System.out.println("Value: " + number));
    }
}