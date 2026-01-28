package com.bl_java_rfp.OOPS_Concepts.AddressBook;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();

        ContactPerson person = new ContactPerson(
                "John",
                "Doe",
                "123 Street",
                "Chennai",
                "Tamil Nadu",
                600001,
                9876543210L,
                "john.doe@email.com"
        );

        addressBook.addContact(person);

        addressBook.editContact(
                "John",
                "456 New Street",
                "Bangalore",
                "Karnataka",
                560001,
                9123456789L,
                "john.updated@email.com"
        );

        addressBook.deleteContact("John");
    }
}
