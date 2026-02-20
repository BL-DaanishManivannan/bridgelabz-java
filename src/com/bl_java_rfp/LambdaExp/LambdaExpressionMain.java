package com.bl_java_rfp.LambdaExp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * UC0 → UC1.3
 */
public class LambdaExpressionMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Java 8 Lambda Expressions Program");

        // ===== UC1.1 & UC1.2 =====
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation division = (a, b) -> a / b;

        MathOperation.printResult(10, 5, "Addition", addition);
        MathOperation.printResult(10, 5, "Subtraction", subtraction);
        MathOperation.printResult(10, 5, "Division", division);

        // ===== UC1.3 =====
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("\nMethod 1: Proper Class");

        class MyConsumer implements Consumer<Integer> {
            @Override
            public void accept(Integer n) {
                System.out.println("Value: " + n);
            }
        }

        // ===== UC1.4 =====
        System.out.println("\nUC1.4: Convert Integer to Double");

        java.util.function.Function<Integer, Double> convertToDouble =
                number -> number.doubleValue();

        numbers.forEach(n -> {
            Double converted = convertToDouble.apply(n);
            System.out.println("Original: " + n + " | Double: " + converted);
        });

        numbers.forEach(new MyConsumer());

        System.out.println("\nMethod 2: Anonymous Class");

        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                System.out.println("Value: " + n);
            }
        });

        System.out.println("\nMethod 3: Lambda Expression");

        numbers.forEach(n -> System.out.println("Value: " + n));
    }
}
