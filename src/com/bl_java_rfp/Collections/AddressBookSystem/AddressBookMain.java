package com.bl_java_rfp.Collections.AddressBookSystem;

import java.util.List;
import java.util.Scanner;

/**
 * UC0–UC8 - Address Book Main
 * Supports search by city or state.
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

            addressBook.addContact(contact);

            System.out.print("\nAdd another contact? (yes/no): ");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        // UC8: Search by City
        System.out.print("\nEnter City to search: ");
        String searchCity = scanner.nextLine();

        List<Contact> cityResults = manager.searchPersonsByCity(searchCity);
        System.out.println("\nPersons in City:");
        cityResults.forEach(System.out::println);

        // UC8: Search by State
        System.out.print("\nEnter State to search: ");
        String searchState = scanner.nextLine();

        List<Contact> stateResults = manager.searchPersonsByState(searchState);
        System.out.println("\nPersons in State:");
        stateResults.forEach(System.out::println);
    }
}
