package com.bl_java_rfp.programming_constructs;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        final int IS_FULL_TIME = 1;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOURS = 8;

        int IS_ABSENT = 0;
        final int IS_PART_TIME = 2;

        int PART_TIME_HOURS = 4;

        int totalWage = 0;
        int WORKING_DAYS_PER_MONTH = 20;

        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            int dailyWage = 0;

            switch (empCheck) {

                case IS_FULL_TIME:
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
                    break;

                case IS_PART_TIME:
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOURS;
                    break;

                default:
                    dailyWage = 0;
            }

            totalWage += dailyWage;
        }

        System.out.println("Total Employee Wage for the Month: " + totalWage);

    }
}