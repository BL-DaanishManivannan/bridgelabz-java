package com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.service;

import com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.exception.CensusAnalyserException;
import com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.model.StateCensus;

import java.util.List;

public class StateCensusAnalyser {

    public List<StateCensus> loadStateCensusData(String csvFilePath) throws CensusAnalyserException {
        CSVStateCensus csvStateCensus = new CSVStateCensus();
        return csvStateCensus.loadCSVData(csvFilePath);
    }

    public int getRecordCount(List<StateCensus> data) {
        return data.size();
    }
}