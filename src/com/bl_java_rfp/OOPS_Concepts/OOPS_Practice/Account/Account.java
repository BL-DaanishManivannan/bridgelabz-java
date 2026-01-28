package com.bl_java_rfp.OOPS_Concepts.OOPS_Practice.Account;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void debit(double amount) {

        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance");
        } else {
            balance -= amount;
            System.out.println("Debit successful. Current balance: " + balance);
        }
    }
}
