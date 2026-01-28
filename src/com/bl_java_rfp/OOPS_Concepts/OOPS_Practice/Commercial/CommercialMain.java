package com.bl_java_rfp.OOPS_Concepts.OOPS_Practice.Commercial;

public class CommercialMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Commercial Data Processing Program");

        StockAccount account = new StockAccount();

        account.buyShares("TCS", 100);
        account.buyShares("Infosys", 50);
        account.sellShares("TCS", 30);

        account.displayCompanyShares();
    }
}
