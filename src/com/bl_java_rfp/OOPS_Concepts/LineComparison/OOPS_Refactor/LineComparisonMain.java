package com.bl_java_rfp.OOPS_Concepts.LineComparison.OOPS_Refactor;

public class LineComparisonMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        Point p1 = new Point(2, 4);
        Point p2 = new Point(6, 8);

        Point p3 = new Point(8, 10);
        Point p4 = new Point(12, 14);

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);

        if (line1.equals(line2)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Lines are not equal");
        }

        int result = line1.compareTo(line2);

        if (result == 0) {
            System.out.println("Both lines are equal");
        } else if (result < 0) {
            System.out.println("Line 1 is shorter than Line 2");
        } else {
            System.out.println("Line 1 is longer than Line 2");
        }
    }
}
