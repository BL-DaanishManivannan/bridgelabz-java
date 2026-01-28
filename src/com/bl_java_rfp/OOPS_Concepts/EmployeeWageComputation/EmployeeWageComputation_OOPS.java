package com.bl_java_rfp.OOPS_Concepts.EmployeeWageComputation;

public class EmployeeWageComputation_OOPS {

    public static final int IS_ABSENT = 0;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String companyName;
    private final int wagePerHour;
    private final int maxWorkingDays;
    private final int maxWorkingHours;

    private int totalEmployeeWage;


    public EmployeeWageComputation_OOPS(String companyName,
                                   int wagePerHour,
                                   int maxWorkingDays,
                                   int maxWorkingHours) {

        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    private int checkAttendance() {
        return (int) (Math.floor(Math.random() * 10) % 3);
    }

    private int getDailyWorkingHours(int empType) {

        switch (empType) {
            case IS_FULL_TIME:
                return 8;

            case IS_PART_TIME:
                return 4;

            default:
                return 0;
        }
    }

    public void computeEmployeeWage() {

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;

        while (totalWorkingDays < maxWorkingDays
                && totalWorkingHours < maxWorkingHours) {

            totalWorkingDays++;

            int empType = checkAttendance();
            int dailyHours = getDailyWorkingHours(empType);

            totalWorkingHours += dailyHours;
            totalEmployeeWage += dailyHours * wagePerHour;
        }
    }

    public void displayEmployeeWage() {
        System.out.println("Total Wage for " + companyName + " : " + totalEmployeeWage);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        EmployeeWageComputation_OOPS tcs = new EmployeeWageComputation_OOPS("TCS", 20, 20, 100);

        EmployeeWageComputation_OOPS infosys = new EmployeeWageComputation_OOPS("Infosys", 25, 22, 110);

        EmployeeWageComputation_OOPS wipro = new EmployeeWageComputation_OOPS("Wipro", 18, 20, 90);

        tcs.computeEmployeeWage();
        infosys.computeEmployeeWage();
        wipro.computeEmployeeWage();

        tcs.displayEmployeeWage();
        infosys.displayEmployeeWage();
        wipro.displayEmployeeWage();
    }
}
