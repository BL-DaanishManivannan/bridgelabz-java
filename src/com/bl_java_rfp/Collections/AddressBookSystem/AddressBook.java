package com.bl_java_rfp.Collections.AddressBookSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * UC3 - Address Book
 * Stores and manages contacts.
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

    public List<Contact> getContacts() {
        return contacts;
    }
}
