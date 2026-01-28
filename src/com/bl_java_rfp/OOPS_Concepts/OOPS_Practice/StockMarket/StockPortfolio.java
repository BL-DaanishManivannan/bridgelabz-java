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

    public ArrayList<Stock> getStockList() {
        return stockList;
    }
}
