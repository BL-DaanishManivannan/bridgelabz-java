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

        if (!filePath.endsWith(".csv")) {
            throw new CensusAnalyserException("Invalid file type. Only CSV allowed");
        }

        List<String> records = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // UC5 → Delimiter validation
            String header = reader.readLine();
            if (header == null || !header.contains(",")) {
                throw new CensusAnalyserException("Invalid delimiter in CSV file");
            }

            Iterator<String> iterator = reader.lines().iterator();

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