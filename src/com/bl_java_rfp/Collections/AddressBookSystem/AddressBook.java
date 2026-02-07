package com.bl_java_rfp.Collections.AddressBookSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * UC3–UC5 - Address Book
 * Manages multiple contacts.
 */
public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public boolean editContact(String firstName, String lastName, Contact updatedContact) {

        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);

            if (contact.getFirstName().equals(firstName)
                    && contact.getLastName().equals(lastName)) {

                contacts.set(i, updatedContact);
                return true;
            }
        }
        return false;
    }

    public boolean deleteContact(String firstName, String lastName) {

        Iterator<Contact> iterator = contacts.iterator();

        while (iterator.hasNext()) {
            Contact contact = iterator.next();

            if (contact.getFirstName().equals(firstName)
                    && contact.getLastName().equals(lastName)) {

                iterator.remove();
                return true;
            }
        }
        return false;
    }

    // UC5: Display all contacts
    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
