package com.bl_java_rfp.FileIO.AddressBook;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();

        // UC2 — Add Contacts
        Contact c1 = new Contact("John", "Doe",
                "123 Main St", "Miami", "Florida",
                "33101", "9876543210", "john@email.com");
        Contact c2 = new Contact("Jane", "Smith",
                "456 Oak Ave", "Orlando", "Florida",
                "32801", "9123456789", "jane@email.com");

        addressBook.addContact(c1);
        addressBook.addContact(c2);

        System.out.println("\n--- All Contacts ---");
        addressBook.displayAllContacts();

        // UC3 — Edit Contact
        Contact updated = new Contact("John", "Doe",
                "789 New Blvd", "Tampa", "Florida",
                "33601", "9999999999", "john.new@email.com");
        addressBook.editContact("John", updated);

        System.out.println("\n--- After Edit ---");
        addressBook.displayAllContacts();

        // UC4 — Delete Contact
        addressBook.deleteContact("Jane");

        System.out.println("\n--- After Delete ---");
        addressBook.displayAllContacts();
    }
}