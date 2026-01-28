package com.bl_java_rfp.OOPS_Concepts.OOPS_Practice.Commercial;

import java.util.ArrayList;
import java.time.LocalDateTime;

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
}
