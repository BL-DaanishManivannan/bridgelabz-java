package com.bl_java_rfp.java_fundementals.LineComputation;

public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        int x1 = 2, y1 = 4;
        int x2 = 6, y2 = 8;

        Double line1Length = Math.sqrt(
                Math.pow(4 - 2, 2) + Math.pow(6 - 4, 2)
        );
        Double line2Length = Math.sqrt(
                Math.pow(8 - 6, 2) + Math.pow(10 - 8, 2)
        );
        int result = line1Length.compareTo(line2Length);

        if (result == 0) {
            System.out.println("Both lines are equal");
        } else if (result < 0) {
            System.out.println("Line 1 is shorter than Line 2");
        } else {
            System.out.println("Line 1 is longer than Line 2");
        }

    }
}
