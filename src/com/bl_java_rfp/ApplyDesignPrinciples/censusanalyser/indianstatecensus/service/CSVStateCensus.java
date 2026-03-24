package com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.service;

import com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.exception.CensusAnalyserException;
import com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.model.StateCensus;

import java.util.List;

public class CSVStateCensus {

    private static final String EXPECTED_HEADER =
            "State,Population,AreaInSqKm,DensityPerSqKm";

    public List<StateCensus> loadCSVData(String filePath) throws CensusAnalyserException {
        CSVLoader loader = new CSVLoader();
        return loader.loadCSVData(filePath, EXPECTED_HEADER);
    }
}