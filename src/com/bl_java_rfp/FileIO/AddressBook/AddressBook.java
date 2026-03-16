package com.bl_java_rfp.FileIO.AddressBook;

import java.util.ArrayList;
import java.util.List;

// Manages a single Address Book with CRUD operations
public class AddressBook {

    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    // UC2 — Add Contact
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added: " + contact.getFirstName()
                + " " + contact.getLastName());
    }

    // UC3 — Edit Contact by First Name
    public void editContact(String firstName, Contact updatedContact) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                contact.setFirstName(updatedContact.getFirstName());
                contact.setLastName(updatedContact.getLastName());
                contact.setAddress(updatedContact.getAddress());
                contact.setCity(updatedContact.getCity());
                contact.setState(updatedContact.getState());
                contact.setZip(updatedContact.getZip());
                contact.setPhoneNumber(updatedContact.getPhoneNumber());
                contact.setEmail(updatedContact.getEmail());
                System.out.println("Contact updated: " + firstName);
                return;
            }
        }
        System.out.println("Contact not found: " + firstName);
    }

    // UC4 — Delete Contact by First Name
    public void deleteContact(String firstName) {
        boolean removed = contacts.removeIf(contact ->
                contact.getFirstName().equalsIgnoreCase(firstName));
        if (removed) {
            System.out.println("Contact deleted: " + firstName);
        } else {
            System.out.println("Contact not found: " + firstName);
        }
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void displayAllContacts() {
        contacts.forEach(System.out::println);
    }
}