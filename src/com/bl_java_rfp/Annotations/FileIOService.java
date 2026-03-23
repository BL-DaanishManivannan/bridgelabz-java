package com.bl_java_rfp.Annotations;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// UC13 — Handles reading and writing Address Book to a file
public class FileIOService {

    private static final String FILE_PATH = "addressbook.txt";

    // Write all contacts to file
    public void writeToFile(AddressBook addressBook) {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(FILE_PATH))) {
            for (Contact contact : addressBook.getContacts()) {
                writer.write(contactToFileLine(contact));
                writer.newLine();
            }
            System.out.println("Address Book written to file: " + FILE_PATH);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Read all contacts from file
    public List<Contact> readFromFile() {
        List<Contact> contacts = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(
                new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Contact contact = fileLineToContact(line);
                if (contact != null) {
                    contacts.add(contact);
                }
            }
            System.out.println("Address Book read from file: " + FILE_PATH);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return contacts;
    }

    // Convert Contact to a comma-separated line for file storage
    private String contactToFileLine(Contact contact) {
        return contact.getFirstName() + ","
                + contact.getLastName() + ","
                + contact.getAddress() + ","
                + contact.getCity() + ","
                + contact.getState() + ","
                + contact.getZip() + ","
                + contact.getPhoneNumber() + ","
                + contact.getEmail();
    }

    // Convert a comma-separated file line back to a Contact object
    private Contact fileLineToContact(String line) {
        String[] fields = line.split(",");
        if (fields.length != 8) {
            System.out.println("Skipping invalid line: " + line);
            return null;
        }
        return new Contact(
                fields[0], fields[1], fields[2],
                fields[3], fields[4], fields[5],
                fields[6], fields[7]
        );
    }
}