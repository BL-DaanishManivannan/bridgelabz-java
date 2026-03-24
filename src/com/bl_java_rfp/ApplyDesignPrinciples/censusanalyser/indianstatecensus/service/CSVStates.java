package com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.service;

import com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.exception.CensusAnalyserException;

public class CSVStates {

    private static final String EXPECTED_HEADER =
            "State Name,TIN,StateCode";

    public int loadCSVData(String filePath) throws CensusAnalyserException {
        CSVLoader loader = new CSVLoader();
        return loader.loadCSVData(filePath, EXPECTED_HEADER);
    }
}