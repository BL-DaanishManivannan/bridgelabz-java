package com.bl_java_rfp.FileIO.AddressBook;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        // UC1 — Model verification
        Contact contact = new Contact("John", "Doe",
                "123 Main St", "Miami", "Florida",
                "33101", "9876543210", "john@email.com");

        System.out.println(contact);
    }
}