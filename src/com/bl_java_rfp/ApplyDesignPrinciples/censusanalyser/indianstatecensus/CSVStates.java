package com.bl_java_rfp.ApplyDesignPrinciples.censusanalyser.indianstatecensus.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class CSVStates {

    public int loadCSVData(String filePath) {
        List<String> records = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            Iterator<String> iterator = reader.lines().iterator();

            // Skip header
            if (iterator.hasNext()) {
                iterator.next();
            }

            while (iterator.hasNext()) {
                records.add(iterator.next());
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace(); // Will handle properly in later UC
        }

        return records.size();
    }
}