package com.bl_java_rfp.Collections.AddressBookSystem;

import java.util.Scanner;

/**
 * UC0–UC3 - Address Book Main
 * Adds and edits contacts.
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

        // UC3: Edit contact
        System.out.print("\nEnter First Name of contact to edit: ");
        String editFirstName = scanner.nextLine();

        System.out.print("Enter Last Name of contact to edit: ");
        String editLastName = scanner.nextLine();

        System.out.print("Enter New City: ");
        String newCity = scanner.nextLine();

        Contact updatedContact = new Contact(
                firstName, lastName,
                address, newCity, state,
                zip, phoneNumber, email
        );

        boolean isUpdated = addressBook.editContact(
                editFirstName, editLastName, updatedContact
        );

        if (isUpdated) {
            System.out.println("\nContact Updated Successfully");
        } else {
            System.out.println("\nContact Not Found");
        }
    }
}
