package com.bl_java_rfp.java_fundementals.EmployeeWage;
public class EmployeeWageComputation {

    private static final int IS_ABSENT = 0;
    private static final int IS_PRESENT = 1;
    private static final int IS_FULL_TIME = 1;

    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOURS = 8;

    private static final int IS_PART_TIME = 2;
    private static final int PART_TIME_HOURS = 4;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int attendance = (int) (Math.random() * 3);

        int dailyWage = 0;

        switch (attendance) {
            case IS_FULL_TIME:
                dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
                System.out.println("Employee is Full Time");
                break;
            case IS_PART_TIME:
                dailyWage = WAGE_PER_HOUR * PART_TIME_HOURS;
                System.out.println("Employee is Part Time");
                break;
            default:
                System.out.println("Employee is Absent");
        }

        System.out.println("Daily Employee Wage: " + dailyWage);
    }
}
