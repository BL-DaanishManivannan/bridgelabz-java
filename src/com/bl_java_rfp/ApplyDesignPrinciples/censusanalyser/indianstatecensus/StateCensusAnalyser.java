package com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.service;

public class StateCensusAnalyser {

    public int loadStateCensusData(String csvFilePath) {
        CSVStateCensus csvStateCensus = new CSVStateCensus();
        return csvStateCensus.loadCSVData(csvFilePath);
    }

    // UC2 Addition
    public int loadStateCodeData(String csvFilePath) {
        CSVStates csvStates = new CSVStates();
        return csvStates.loadCSVData(csvFilePath);
    }
}