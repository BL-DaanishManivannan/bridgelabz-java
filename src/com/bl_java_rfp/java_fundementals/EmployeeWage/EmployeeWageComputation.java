package com.bl_java_rfp.java_fundementals.EmployeeWage;

public class EmployeeWageComputation {

    private static final int IS_ABSENT = 0;
    private static final int IS_PRESENT = 1;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int attendance = (int) (Math.random() * 2);

        if (attendance == IS_PRESENT) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
