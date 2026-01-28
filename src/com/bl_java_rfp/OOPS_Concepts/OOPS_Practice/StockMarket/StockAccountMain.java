package com.bl_java_rfp.OOPS_Concepts.OOPS_Practice.StockMarket;

public class StockAccountMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Stock Account Management Program");

        StockPortfolio portfolio = new StockPortfolio();

        Stock tcs = new Stock("TCS", 10, 800);
        Stock infosys = new Stock("Infosys", 5, 1200);
        Stock wipro = new Stock("Wipro", 8, 600);

        portfolio.addStock(tcs);
        portfolio.addStock(infosys);
        portfolio.addStock(wipro);

        double totalValue = portfolio.calculateTotalPortfolioValue();

        System.out.println("Total Portfolio Value: " + totalValue);
    }
}
