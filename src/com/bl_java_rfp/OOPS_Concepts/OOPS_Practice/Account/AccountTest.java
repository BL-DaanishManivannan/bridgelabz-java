package com.bl_java_rfp.OOPS_Concepts.OOPS_Practice.Account;

public class AccountTest {

    public static void main(String[] args) {

        System.out.println("Welcome to Account Debit Validation Program");

        Account account = new Account(5000);

        account.debit(2000);

        account.debit(4000);
    }
}
