package com.bl_java_rfp.Collections.AddressBookSystem;

import java.util.Scanner;

/**
 * UC0–UC4 - Address Book Main
 * Adds, edits, and deletes contacts.
 */
public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        // UC2: Add contact
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        System.out.print("Enter State: ");
        String state = scanner.nextLine();

        System.out.print("Enter Zip: ");
        String zip = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        Contact contact = new Contact(
                firstName, lastName,
                address, city, state,
                zip, phoneNumber, email
        );

        addressBook.addContact(contact);

        // UC4: Delete contact
        System.out.print("\nEnter First Name of contact to delete: ");
        String deleteFirstName = scanner.nextLine();

        System.out.print("Enter Last Name of contact to delete: ");
        String deleteLastName = scanner.nextLine();

        boolean isDeleted = addressBook.deleteContact(
                deleteFirstName, deleteLastName
        );

        if (isDeleted) {
            System.out.println("\nContact Deleted Successfully");
        } else {
            System.out.println("\nContact Not Found");
        }
    }
}
