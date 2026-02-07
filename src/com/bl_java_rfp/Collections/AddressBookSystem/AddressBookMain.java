package com.bl_java_rfp.Collections.AddressBookSystem;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * UC0–UC9 - Address Book Main
 * Entry point and execution flow.
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

            boolean added = addressBook.addContact(contact);
            if (!added) {
                System.out.println("Duplicate Contact. Not Added.");
            }

            System.out.print("\nAdd another contact? (yes/no): ");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        // UC8: Search
        System.out.print("\nEnter City to search: ");
        String searchCity = scanner.nextLine();
        List<Contact> cityResults = manager.searchPersonsByCity(searchCity);
        cityResults.forEach(System.out::println);

        System.out.print("\nEnter State to search: ");
        String searchState = scanner.nextLine();
        List<Contact> stateResults = manager.searchPersonsByState(searchState);
        stateResults.forEach(System.out::println);

        // UC9: View grouped
        System.out.println("\nPersons Grouped by City:");
        Map<String, List<Contact>> byCity = manager.viewPersonsByCity();
        byCity.forEach((city, contacts) -> {
            System.out.println("City: " + city);
            contacts.forEach(System.out::println);
        });

        System.out.println("\nPersons Grouped by State:");
        Map<String, List<Contact>> byState = manager.viewPersonsByState();
        byState.forEach((state, contacts) -> {
            System.out.println("State: " + state);
            contacts.forEach(System.out::println);
        });
    }
}
