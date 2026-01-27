package com.bl_java_rfp.java_fundementals.LineComputation;

public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        int x1 = 2, y1 = 4;
        int x2 = 6, y2 = 8;

        double length = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        System.out.println("Length of the line: " + length);

    }
}
