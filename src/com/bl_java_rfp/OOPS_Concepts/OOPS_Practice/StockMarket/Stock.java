package com.bl_java_rfp.OOPS_Concepts.OOPS_Practice.StockMarket;

public class Stock {

    private String stockName;
    private int numberOfShares;
    private double sharePrice;

    public Stock(String stockName, int numberOfShares, double sharePrice) {
        this.stockName = stockName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }
    public double calculateStockValue() {
        return numberOfShares * sharePrice;
    }
    @Override
    public String toString() {
        return stockName;
    }

}
