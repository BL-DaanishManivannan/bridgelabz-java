package com.bl_java_rfp.OOPS_Concepts.EmployeeWageComputation;

public class EmployeeWageComputation_OOPS {

    public static final int IS_ABSENT = 0;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static final int FULL_DAY_HOURS = 8;
    public static final int PART_TIME_HOURS = 4;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        computeEmployeeWage("TCS", 20, 20, 100);
        computeEmployeeWage("Infosys", 25, 22, 110);
        computeEmployeeWage("Wipro", 18, 20, 90);
    }

    // UC8: Compute wage using method parameters (NO class variables)
    public static void computeEmployeeWage(String companyName,
                                           int wagePerHour,
                                           int maxWorkingDays,
                                           int maxWorkingHours) {

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalEmployeeWage = 0;

        while (totalWorkingDays < maxWorkingDays
                && totalWorkingHours < maxWorkingHours) {

            totalWorkingDays++;

            int empType = (int) (Math.floor(Math.random() * 10) % 3);
            int dailyHours = 0;

            switch (empType) {
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
            totalEmployeeWage += dailyHours * wagePerHour;
        }

        System.out.println(
                "Total Wage for " + companyName + " : " + totalEmployeeWage
        );
    }
}
