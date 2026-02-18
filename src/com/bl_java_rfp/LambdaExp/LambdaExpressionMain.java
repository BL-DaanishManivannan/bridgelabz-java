package com.bl_java_rfp.LambdaExp;

/**
 * UC0 & UC1.1 - Lambda Expression Main
 */
public class LambdaExpressionMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Java 8 Lambda Expressions Program");

        // Lambda for Addition
        MathOperation addition = (a, b) -> a + b;

        // Lambda for Subtraction
        MathOperation subtraction = (a, b) -> a - b;

        // Lambda for Division
        MathOperation division = (a, b) -> a / b;

        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + addition.operate(num1, num2));
        System.out.println("Subtraction: " + subtraction.operate(num1, num2));
        System.out.println("Division: " + division.operate(num1, num2));
    }
}
