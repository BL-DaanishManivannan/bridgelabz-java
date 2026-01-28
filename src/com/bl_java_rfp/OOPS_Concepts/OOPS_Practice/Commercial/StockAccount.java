package com.bl_java_rfp.OOPS_Concepts.OOPS_Practice.Commercial;

import java.util.ArrayList;

public class StockAccount {

    private ArrayList<CompanyShares> companySharesList;

    public StockAccount() {
        companySharesList = new ArrayList<>();
    }

    // UC2: Buy shares
    public void buyShares(String companyName, int sharesToBuy) {

        for (CompanyShares company : companySharesList) {
            if (company.getCompanyName().equals(companyName)) {
                company.addShares(sharesToBuy);
                company.updateTransactionTime();
                System.out.println("Shares bought successfully for " + companyName);
                return;
            }
        }

        CompanyShares newCompany =
                new CompanyShares(companyName, sharesToBuy);
        companySharesList.add(newCompany);

        System.out.println("New company shares added for " + companyName);
    }

    // UC3: Sell shares
    public void sellShares(String companyName, int sharesToSell) {

        for (CompanyShares company : companySharesList) {
            if (company.getCompanyName().equals(companyName)) {

                if (sharesToSell > company.getNumberOfShares()) {
                    System.out.println("Not enough shares to sell for " + companyName);
                    return;
                }

                company.removeShares(sharesToSell);
                company.updateTransactionTime();
                System.out.println("Shares sold successfully for " + companyName);

                if (company.getNumberOfShares() == 0) {
                    companySharesList.remove(company);
                    System.out.println(companyName + " removed from records");
                }

                return;
            }
        }

        System.out.println("Company not found: " + companyName);
    }
}
