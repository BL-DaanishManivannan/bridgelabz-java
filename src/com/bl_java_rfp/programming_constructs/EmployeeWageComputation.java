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

        int MAX_WORKING_DAYS = 20;
        int MAX_WORKING_HOURS = 100;

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;

        while (totalWorkingDays < MAX_WORKING_DAYS
                && totalWorkingHours < MAX_WORKING_HOURS) {

            totalWorkingDays++;

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            int dailyHours = 0;

            switch (empCheck) {
                case IS_FULL_TIME:
                    dailyHours = FULL_DAY_HOURS;
                    break;

                case IS_PART_TIME:
                    dailyHours = PART_TIME_HOURS;
                    break;

                default:
                    dailyHours = 0;
            }

            totalWorkingHours += dailyHours;
            totalWage += dailyHours * WAGE_PER_HOUR;
        }


        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Employee Wage: " + totalWage);
    }
}