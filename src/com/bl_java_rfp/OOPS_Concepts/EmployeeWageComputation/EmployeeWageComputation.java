package com.bl_java_rfp.OOPS_Concepts.EmployeeWageComputation;

public class EmployeeWageComputation {

    public static final int IS_ABSENT = 0;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 8;
    public static final int PART_TIME_HOURS = 4;

    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        EmployeeWageComputation empWage = new EmployeeWageComputation();
        empWage.calculateMonthlyWage();
    }

    public int checkAttendance() {
        return (int) (Math.floor(Math.random() * 10) % 3);
    }

    public int getDailyWorkingHours(int empType) {

        int hours = 0;

        switch (empType) {
            case IS_FULL_TIME:
                hours = FULL_DAY_HOURS;
                break;

            case IS_PART_TIME:
                hours = PART_TIME_HOURS;
                break;

            default:
                hours = 0;
        }

        return hours;
    }

    public void calculateMonthlyWage() {

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        while (totalWorkingDays < MAX_WORKING_DAYS
                && totalWorkingHours < MAX_WORKING_HOURS) {

            totalWorkingDays++;

            int empType = checkAttendance();
            int dailyHours = getDailyWorkingHours(empType);

            totalWorkingHours += dailyHours;
            totalWage += dailyHours * WAGE_PER_HOUR;
        }

        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Employee Wage: " + totalWage);
    }
}
