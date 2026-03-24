package com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.service;

public class StateCensusAnalyser {

    public int loadStateCensusData(String csvFilePath) {
        CSVStateCensus csvStateCensus = new CSVStateCensus();
        return csvStateCensus.loadCSVData(csvFilePath);
    }
}