package com.bl_java_rfp.Collections.AddressBookSystem;

import java.util.Scanner;

/**
 * UC0–UC7 - Address Book Main
 * Prevents duplicate contact entries.
 */
public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner scanner = new Scanner(System.in);
        AddressBookManager manager = new AddressBookManager();

        System.out.print("Enter Address Book Name: ");
        String bookName = scanner.nextLine();

        AddressBook addressBook = new AddressBook();
        manager.addAddressBook(bookName, addressBook);

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

            boolean isAdded = addressBook.addContact(contact);

            if (!isAdded) {
                System.out.println("Duplicate Contact Found. Not Added.");
            }

            System.out.print("\nAdd another contact? (yes/no): ");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("\nAll Contacts:");
        addressBook.displayContacts();
    }
}
