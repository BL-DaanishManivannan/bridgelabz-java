package com.bl_java_rfp.LambdaExp;

/**
 * UC1.1 & UC1.2 - Functional Interface
 */
@FunctionalInterface
public interface MathOperation {

    int operate(int a, int b);

    // UC1.2: Static method to print result
    static void printResult(int a, int b, String operation, MathOperation op) {
        System.out.println("Result of " + operation + " : " + op.operate(a, b));
    }
}