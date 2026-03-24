package com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.service;

import com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.exception.CensusAnalyserException;
import com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.model.StateCensus;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StateCensusAnalyser {

    public List<StateCensus> loadStateCensusData(String csvFilePath) throws CensusAnalyserException {
        CSVStateCensus csvStateCensus = new CSVStateCensus();
        return csvStateCensus.loadCSVData(csvFilePath);
    }

    public int getRecordCount(List<StateCensus> data) {
        return data.size();
    }

    // UC9 → Sort by State Name
    public List<StateCensus> sortByStateName(List<StateCensus> data) {

        return data.stream()
                .sorted(Comparator.comparing(StateCensus::getState))
                .collect(Collectors.toList());
    }
}