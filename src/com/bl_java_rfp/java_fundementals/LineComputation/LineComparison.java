package com.bl_java_rfp.java_fundementals.LineComputation;

public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        int x1 = 2, y1 = 4;
        int x2 = 6, y2 = 8;

        double line1Length = Math.sqrt(
                Math.pow(4 - 2, 2) + Math.pow(6 - 4, 2)
        );
        double line2Length = Math.sqrt(
                Math.pow(8 - 6, 2) + Math.pow(10 - 8, 2)
        );
        if (Double.valueOf(line1Length).equals(line2Length)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Lines are not equal");
        }

    }
}
