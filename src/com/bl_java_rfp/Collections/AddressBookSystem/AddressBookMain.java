package com.bl_java_rfp.Collections.AddressBookSystem;

import java.util.Scanner;

/**
 * UC0–UC5 - Address Book Main
 * Supports adding multiple contacts.
 */
public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        String choice;

        do {
            System.out.print("\nEnter First Name: ");
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

            System.out.print("\nDo you want to add another contact? (yes/no): ");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("\nAll Contacts in Address Book:");
        addressBook.displayContacts();
    }
}
