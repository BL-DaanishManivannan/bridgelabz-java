package com.bl_java_rfp.FileIO.AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBook {

    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    // UC2 — Add Contact with UC7 duplicate check
    public void addContact(Contact contact) {
        boolean isDuplicate = contacts.stream()
                .anyMatch(c -> c.equals(contact));
        if (isDuplicate) {
            System.out.println("Duplicate contact ignored: "
                    + contact.getFirstName() + " " + contact.getLastName());
        } else {
            contacts.add(contact);
            System.out.println("Contact added: "
                    + contact.getFirstName() + " " + contact.getLastName());
        }
    }

    // UC3 — Edit Contact
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

    // UC4 — Delete Contact
    public void deleteContact(String firstName) {
        boolean removed = contacts.removeIf(c ->
                c.getFirstName().equalsIgnoreCase(firstName));
        if (removed) {
            System.out.println("Contact deleted: " + firstName);
        } else {
            System.out.println("Contact not found: " + firstName);
        }
    }

    // UC8 — Search by City
    public List<Contact> searchByCity(String city) {
        return contacts.stream()
                .filter(c -> c.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    // UC8 — Search by State
    public List<Contact> searchByState(String state) {
        return contacts.stream()
                .filter(c -> c.getState().equalsIgnoreCase(state))
                .collect(Collectors.toList());
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void displayAllContacts() {
        contacts.forEach(System.out::println);
    }
}