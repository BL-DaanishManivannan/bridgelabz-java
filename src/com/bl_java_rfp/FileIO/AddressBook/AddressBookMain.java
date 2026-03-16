package com.bl_java_rfp.FileIO.AddressBook;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        // UC6 — Create Address Book System with multiple books
        AddressBookSystem system = new AddressBookSystem();
        system.addAddressBook("Friends");
        system.addAddressBook("Work");

        // UC5 — Add multiple contacts to Friends book
        AddressBook friendsBook = system.getAddressBook("Friends");
        friendsBook.addContact(new Contact("John", "Doe",
                "123 Main St", "Miami", "Florida",
                "33101", "9876543210", "john@email.com"));
        friendsBook.addContact(new Contact("Jane", "Smith",
                "456 Oak Ave", "Orlando", "Florida",
                "32801", "9123456789", "jane@email.com"));

        // UC5 — Add multiple contacts to Work book
        AddressBook workBook = system.getAddressBook("Work");
        workBook.addContact(new Contact("Alice", "Brown",
                "789 Corp Blvd", "Miami", "Florida",
                "33102", "9000000001", "alice@work.com"));
        workBook.addContact(new Contact("Bob", "White",
                "101 Biz Lane", "Tampa", "Florida",
                "33601", "9000000002", "bob@work.com"));

        // Display all Address Books
        system.displayAllAddressBooks();
    }
}