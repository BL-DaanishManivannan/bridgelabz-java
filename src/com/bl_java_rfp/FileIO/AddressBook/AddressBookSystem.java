package com.bl_java_rfp.FileIO.AddressBook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AddressBookSystem {

    private Map<String, AddressBook> addressBookMap;

    public AddressBookSystem() {
        this.addressBookMap = new HashMap<>();
    }

    public void addAddressBook(String name) {
        if (addressBookMap.containsKey(name)) {
            System.out.println("Address Book already exists: " + name);
        } else {
            addressBookMap.put(name, new AddressBook());
            System.out.println("Address Book created: " + name);
        }
    }

    public AddressBook getAddressBook(String name) {
        if (addressBookMap.containsKey(name)) {
            return addressBookMap.get(name);
        }
        System.out.println("Address Book not found: " + name);
        return null;
    }

    // UC8 — Search across all Address Books by City
    public void searchByCity(String city) {
        System.out.println("\n--- Contacts in City: " + city + " ---");
        addressBookMap.forEach((bookName, book) -> {
            List<Contact> results = book.searchByCity(city);
            results.forEach(c ->
                    System.out.println("[" + bookName + "] " + c));
        });
    }

    // UC8 — Search across all Address Books by State
    public void searchByState(String state) {
        System.out.println("\n--- Contacts in State: " + state + " ---");
        addressBookMap.forEach((bookName, book) -> {
            List<Contact> results = book.searchByState(state);
            results.forEach(c ->
                    System.out.println("[" + bookName + "] " + c));
        });
    }

    // UC9 — View contacts grouped by City
    public void viewGroupedByCity() {
        System.out.println("\n--- Contacts Grouped by City ---");
        addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .collect(Collectors.groupingBy(Contact::getCity))
                .forEach((city, contacts) -> {
                    System.out.println("City: " + city);
                    contacts.forEach(c -> System.out.println("  " + c));
                });
    }

    // UC9 — View contacts grouped by State
    public void viewGroupedByState() {
        System.out.println("\n--- Contacts Grouped by State ---");
        addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .collect(Collectors.groupingBy(Contact::getState))
                .forEach((state, contacts) -> {
                    System.out.println("State: " + state);
                    contacts.forEach(c -> System.out.println("  " + c));
                });
    }

    // UC10 — Count contacts by City
    public void countByCity() {
        System.out.println("\n--- Contact Count by City ---");
        addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .collect(Collectors.groupingBy(Contact::getCity,
                        Collectors.counting()))
                .forEach((city, count) ->
                        System.out.println("City: " + city + " | Count: " + count));
    }

    // UC10 — Count contacts by State
    public void countByState() {
        System.out.println("\n--- Contact Count by State ---");
        addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .collect(Collectors.groupingBy(Contact::getState,
                        Collectors.counting()))
                .forEach((state, count) ->
                        System.out.println("State: " + state + " | Count: " + count));
    }
    // UC11 — Sort all contacts alphabetically by First Name
    public void sortByName() {
        System.out.println("\n--- Contacts Sorted by Name ---");
        addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .sorted(Comparator.comparing(Contact::getFirstName))
                .forEach(System.out::println);
    }

    // UC12 — Sort all contacts by City
    public void sortByCity() {
        System.out.println("\n--- Contacts Sorted by City ---");
        addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .sorted(Comparator.comparing(Contact::getCity))
                .forEach(System.out::println);
    }

    // UC12 — Sort all contacts by State
    public void sortByState() {
        System.out.println("\n--- Contacts Sorted by State ---");
        addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .sorted(Comparator.comparing(Contact::getState))
                .forEach(System.out::println);
    }

    // UC12 — Sort all contacts by Zip
    public void sortByZip() {
        System.out.println("\n--- Contacts Sorted by Zip ---");
        addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .sorted(Comparator.comparing(Contact::getZip))
                .forEach(System.out::println);
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