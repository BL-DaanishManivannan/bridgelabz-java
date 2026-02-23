package com.bl_java_rfp.Java8.Streams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * UC0 → UC2.9 Stream API Operations
 */
public class StreamApiMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Java 8 Streams API Program");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Initial Numbers: " + numbers);

        // ===== UC2.1: Internal Iteration =====
        System.out.println("\nUC2.1: Iterate using stream.forEach");
        numbers.stream().forEach(number -> System.out.println("Value: " + number));

        // ===== UC2.2: Map (Transformation) =====
        System.out.println("\nUC2.2: Transform each element to Double using map()");
        numbers.stream()
                .map(Integer::doubleValue) // Using Method Reference
                .forEach(d -> System.out.println("Double Value: " + d));

        // ===== UC2.3: Collect to List =====
        System.out.println("\nUC2.3: Store transformed double values into new List");
        List<Double> doubleList = numbers.stream()
                .map(Integer::doubleValue)
                .collect(Collectors.toList());
        System.out.println("Collected Double List: " + doubleList);

        // ===== UC2.4: Filter =====
        System.out.println("\nUC2.4: Filter even numbers");
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // ===== UC2.5: Find First =====
        System.out.println("\nUC2.5: Find first even number");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst()
                .ifPresent(val -> System.out.println("First Even Number: " + val));

        // ===== UC2.6: Min and Max =====
        System.out.println("\nUC2.6: Find min and max even numbers");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .min(Comparator.naturalOrder())
                .ifPresent(min -> System.out.println("Minimum Even Number: " + min));

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Comparator.naturalOrder())
                .ifPresent(max -> System.out.println("Maximum Even Number: " + max));

        // ===== UC2.7: Reduce (Sum) and Average =====
        System.out.println("\nUC2.7: Find sum and average");
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(avg -> System.out.println("Average: " + avg));

        // ===== UC2.8: Match Operations =====
        System.out.println("\nUC2.8: Match operations");
        System.out.println("All numbers even? " + numbers.stream().allMatch(n -> n % 2 == 0));
        System.out.println("Any number even? " + numbers.stream().anyMatch(n -> n % 2 == 0));
        System.out.println("No negative numbers? " + numbers.stream().noneMatch(n -> n < 0));

        // ===== UC2.9: Sorting =====
        System.out.println("\nUC2.9: Sort numbers in ascending order");
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Numbers: " + sortedNumbers);
    }
}