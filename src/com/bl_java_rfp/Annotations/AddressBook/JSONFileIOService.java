package com.bl_java_rfp.Annotations.AddressBook;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

// UC15 — Handles reading and writing Address Book contacts as JSON
public class JSONFileIOService {

    private static final String JSON_FILE_PATH = "addressbook.json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    // Write contacts to JSON file
    public void writeToJSON(List<Contact> contacts) {
        try (FileWriter writer = new FileWriter(JSON_FILE_PATH)) {
            gson.toJson(contacts, writer);
            System.out.println("Contacts written to JSON: " + JSON_FILE_PATH);
        } catch (IOException e) {
            System.out.println("Error writing JSON: " + e.getMessage());
        }
    }

    // Read contacts from JSON file
    public List<Contact> readFromJSON() {
        List<Contact> contacts = null;
        try (FileReader reader = new FileReader(JSON_FILE_PATH)) {
            Type contactListType = new TypeToken<List<Contact>>() {}.getType();
            contacts = gson.fromJson(reader, contactListType);
            System.out.println("Contacts read from JSON: " + JSON_FILE_PATH);
        } catch (IOException e) {
            System.out.println("Error reading JSON: " + e.getMessage());
        }
        return contacts;
    }
}