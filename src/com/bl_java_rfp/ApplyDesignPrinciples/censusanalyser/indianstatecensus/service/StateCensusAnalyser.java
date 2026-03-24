package com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.service;

import com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.exception.CensusAnalyserException;

public class StateCensusAnalyser {

    public int loadStateCensusData(String csvFilePath) throws CensusAnalyserException {
        CSVStateCensus csvStateCensus = new CSVStateCensus();
        return csvStateCensus.loadCSVData(csvFilePath);
    }

    public int loadStateCodeData(String csvFilePath) throws CensusAnalyserException {
        CSVStates csvStates = new CSVStates();
        return csvStates.loadCSVData(csvFilePath);
    }
}