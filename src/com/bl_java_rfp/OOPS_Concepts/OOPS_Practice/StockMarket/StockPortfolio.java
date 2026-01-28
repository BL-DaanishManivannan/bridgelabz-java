package com.bl_java_rfp.OOPS_Concepts.OOPS_Practice.StockMarket;

import java.util.ArrayList;

public class StockPortfolio {

    private ArrayList<Stock> stockList;

    public StockPortfolio() {
        stockList = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stockList.add(stock);
        System.out.println("Stock added to portfolio");
    }

    public double calculateTotalPortfolioValue() {

        double totalValue = 0;

        for (Stock stock : stockList) {
            double stockValue = stock.calculateStockValue();
            System.out.println(
                    "Stock: " + stock + " | Value: " + stockValue
            );
            totalValue += stockValue;
        }

        return totalValue;
    }
}
