package com.bl_java_rfp.LambdaExp;

/**
 * UC0 → UC1.2
 */
public class LambdaExpressionMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Java 8 Lambda Expressions Program");

        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation division = (a, b) -> a / b;

        int num1 = 10;
        int num2 = 5;

        // UC1.2: Passing lambda as parameter
        MathOperation.printResult(num1, num2, "Addition", addition);
        MathOperation.printResult(num1, num2, "Subtraction", subtraction);
        MathOperation.printResult(num1, num2, "Division", division);
    }
}