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

        // ===== UC2.2 =====
        System.out.println("\nUC2.2: Transform each element to Double using map()");

        numbers.stream()
                .map(number -> number.doubleValue())
                .forEach(d -> System.out.println("Double Value: " + d));

        // ===== UC2.3 =====
        System.out.println("\nUC2.3: Store transformed double values into new List");

        java.util.List<Double> doubleList = numbers.stream()
                .map(number -> number.doubleValue())
                .collect(java.util.stream.Collectors.toList());

        System.out.println("Collected Double List: " + doubleList);

        // ===== UC2.4 =====
        System.out.println("\nUC2.4: Filter even numbers");

        java.util.List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(java.util.stream.Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);
    }
}