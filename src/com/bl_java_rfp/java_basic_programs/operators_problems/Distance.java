package com.bl_java_rfp.java_basic_programs.operators_problems;
// Run with CLI Arguments

public class Distance {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Provide x and y values.");
            return;
        }

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double distance = Math.sqrt((x * x) + (y * y));

        System.out.println("Distance from origin = " + distance);
    }
}
