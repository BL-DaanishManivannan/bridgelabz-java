package com.bl_java_rfp.Annotations.AddressBook;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

// UC14 — Handles reading and writing Address Book contacts as CSV
public class CSVFileIOService {

    private static final String CSV_FILE_PATH = "addressbook.csv";

    // Write contacts to CSV file
    public void writeToCSV(List<Contact> contacts) {
        try (Writer writer = new FileWriter(CSV_FILE_PATH)) {
            StatefulBeanToCsv<Contact> beanToCsv =
                    new StatefulBeanToCsvBuilder<Contact>(writer).build();
            beanToCsv.write(contacts);
            System.out.println("Contacts written to CSV: " + CSV_FILE_PATH);
        } catch (IOException | CsvDataTypeMismatchException
                 | CsvRequiredFieldEmptyException e) {
            System.out.println("Error writing CSV: " + e.getMessage());
        }
    }

    // Read contacts from CSV file
    public List<Contact> readFromCSV() {
        List<Contact> contacts = null;
        try (FileReader reader = new FileReader(CSV_FILE_PATH)) {
            contacts = new CsvToBeanBuilder<Contact>(reader)
                    .withType(Contact.class)
                    .build()
                    .parse();
            System.out.println("Contacts read from CSV: " + CSV_FILE_PATH);
        } catch (IOException e) {
            System.out.println("Error reading CSV: " + e.getMessage());
        }
        return contacts;
    }
}