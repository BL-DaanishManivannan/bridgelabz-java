package com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus;

import com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.service.StateCensusAnalyser;
import com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.exception.CensusAnalyserException;
import com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.model.StateCensus;

import java.util.List;

public class StateCensusAnalyserApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Indian State Census Analyser");

        StateCensusAnalyser analyser = new StateCensusAnalyser();

        try {
            List<StateCensus> data = analyser.loadStateCensusData("path/to/your/file.csv");

            int count = analyser.getRecordCount(data);

            System.out.println("Total Records: " + count);

        } catch (CensusAnalyserException e) {
            System.out.println(e.getMessage());
        }
    }
}