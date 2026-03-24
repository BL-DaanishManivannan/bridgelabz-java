package com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.service;

import com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.exception.CensusAnalyserException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class CSVStates {

    public int loadCSVData(String filePath) throws CensusAnalyserException {
        List<String> records = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            Iterator<String> iterator = reader.lines().iterator();

            if (iterator.hasNext()) {
                iterator.next();
            }

            while (iterator.hasNext()) {
                records.add(iterator.next());
            }

            reader.close();

        } catch (IOException e) {
            throw new CensusAnalyserException("Incorrect file path or file not found");
        }

        return records.size();
    }
}