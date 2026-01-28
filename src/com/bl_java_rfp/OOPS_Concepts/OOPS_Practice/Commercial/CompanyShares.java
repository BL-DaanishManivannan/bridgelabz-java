package com.bl_java_rfp.OOPS_Concepts.OOPS_Practice.Commercial;

import java.time.LocalDateTime;

public class CompanyShares {

    private String companyName;
    private int numberOfShares;
    private LocalDateTime transactionTime;

    public CompanyShares(String companyName, int numberOfShares) {
        this.companyName = companyName;
        this.numberOfShares = numberOfShares;
        this.transactionTime = LocalDateTime.now();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void addShares(int shares) {
        this.numberOfShares += shares;
    }

    public void updateTransactionTime() {
        this.transactionTime = LocalDateTime.now();
    }

}
