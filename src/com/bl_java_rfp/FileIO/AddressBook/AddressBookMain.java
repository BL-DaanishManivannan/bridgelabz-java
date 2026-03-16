package com.bl_java_rfp.FileIO.AddressBook;

import java.util.List;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        AddressBookSystem system = new AddressBookSystem();
        system.addAddressBook("Friends");

        AddressBook friendsBook = system.getAddressBook("Friends");
        friendsBook.addContact(new Contact("John", "Doe",
                "123 Main St", "Miami", "Florida",
                "33101", "9876543210", "john@email.com"));
        friendsBook.addContact(new Contact("Jane", "Smith",
                "456 Oak Ave", "Orlando", "Florida",
                "32801", "9123456789", "jane@email.com"));
        friendsBook.addContact(new Contact("Alice", "Brown",
                "789 Corp Blvd", "Miami", "Florida",
                "33102", "9000000001", "alice@work.com"));

        System.out.println("\n--- Contacts Before Write ---");
        friendsBook.displayAllContacts();

        // UC13 — Write to file
        FileIOService fileIOService = new FileIOService();
        fileIOService.writeToFile(friendsBook);

        // UC13 — Read from file
        List<Contact> contactsFromFile = fileIOService.readFromFile();

        System.out.println("\n--- Contacts Read From File ---");
        contactsFromFile.forEach(System.out::println);
    }
}