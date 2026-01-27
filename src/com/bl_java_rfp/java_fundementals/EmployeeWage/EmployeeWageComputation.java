package com.bl_java_rfp.java_fundementals.EmployeeWage;

public class EmployeeWageComputation {

    private static final int IS_ABSENT = 0;
    private static final int IS_PRESENT = 1;

    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOURS = 8;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int attendance = (int) (Math.random() * 2);

        int dailyWage = 0;

        if (attendance == IS_PRESENT) {
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
        System.out.println("Daily Employee Wage: " + dailyWage);
    }
}
