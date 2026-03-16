package com.bl_java_rfp.FileIO.AddressBook;

import java.util.HashMap;
import java.util.Map;

// UC6 — Manages multiple Address Books using a Map
public class AddressBookSystem {

    private Map<String, AddressBook> addressBookMap;

    public AddressBookSystem() {
        this.addressBookMap = new HashMap<>();
    }

    // Add a new Address Book with a unique name
    public void addAddressBook(String name) {
        if (addressBookMap.containsKey(name)) {
            System.out.println("Address Book already exists: " + name);
        } else {
            addressBookMap.put(name, new AddressBook());
            System.out.println("Address Book created: " + name);
        }
    }

    // Get an Address Book by name
    public AddressBook getAddressBook(String name) {
        if (addressBookMap.containsKey(name)) {
            return addressBookMap.get(name);
        }
        System.out.println("Address Book not found: " + name);
        return null;
    }

    public Map<String, AddressBook> getAddressBookMap() {
        return addressBookMap;
    }

    public void displayAllAddressBooks() {
        addressBookMap.forEach((name, book) -> {
            System.out.println("\n--- Address Book: " + name + " ---");
            book.displayAllContacts();
        });
    }
}