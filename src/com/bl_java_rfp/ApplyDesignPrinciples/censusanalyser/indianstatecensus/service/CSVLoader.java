package com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.service;

import com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.exception.CensusAnalyserException;
import com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.model.StateCensus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class CSVLoader {

    public List<StateCensus> loadCSVData(String filePath, String expectedHeader) throws CensusAnalyserException {

        if (!filePath.endsWith(".csv")) {
            throw new CensusAnalyserException("Invalid file type. Only CSV allowed");
        }

        List<StateCensus> records = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String header = reader.readLine();

            // Delimiter check
            if (header == null || !header.contains(",")) {
                throw new CensusAnalyserException("Invalid delimiter in CSV file");
            }

            // Header check
            if (!header.equals(expectedHeader)) {
                throw new CensusAnalyserException("Invalid CSV header");
            }

            Iterator<String> iterator = reader.lines().iterator();

            while (iterator.hasNext()) {
                String line = iterator.next();
                String[] data = line.split(",");

                StateCensus census = new StateCensus(
                        data[0],
                        Integer.parseInt(data[1]),
                        Integer.parseInt(data[2]),
                        Integer.parseInt(data[3])
                );

                records.add(census);
            }

            reader.close();

        } catch (IOException e) {
            throw new CensusAnalyserException("Incorrect file path or file not found");
        }

        return records;
    }
}