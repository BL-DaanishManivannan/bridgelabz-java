package com.bl_java_rfp.programming_constructs;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int IS_FULL_TIME = 1;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOURS = 8;

        int dailyWage = 0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_FULL_TIME) {
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
        System.out.println("Daily Employee Wage: " + dailyWage);

    }
}
