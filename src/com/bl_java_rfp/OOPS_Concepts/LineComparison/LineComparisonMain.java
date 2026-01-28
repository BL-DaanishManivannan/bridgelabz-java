package com.bl_java_rfp.OOPS_Concepts.LineComparison;

public class LineComparisonMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

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

        // UC3: Compare two lines using compareTo()
        int comparisonResult =
                Double.valueOf(line1Length).compareTo(line2Length);

        if (comparisonResult == 0) {
            System.out.println("Both lines are equal");
        } else if (comparisonResult < 0) {
            System.out.println("Line 1 is shorter than Line 2");
        } else {
            System.out.println("Line 1 is longer than Line 2");
        }
    }
}
