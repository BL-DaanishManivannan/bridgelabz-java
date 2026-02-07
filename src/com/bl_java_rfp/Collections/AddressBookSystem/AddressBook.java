package com.bl_java_rfp.Collections.AddressBookSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * UC3–UC7 - Address Book
 * Stores, edits, deletes and prevents duplicate contacts.
 */
public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();

    // UC7: Add contact with duplicate check
    public boolean addContact(Contact contact) {

        boolean isDuplicate = contacts.stream()
                .anyMatch(existing -> existing.equals(contact));

        if (isDuplicate) {
            return false;
        }

        contacts.add(contact);
        return true;
    }

    // UC3: Edit contact
    public boolean editContact(String firstName, String lastName, Contact updatedContact) {

        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);

            if (contact.getFirstName().equalsIgnoreCase(firstName)
                    && contact.getLastName().equalsIgnoreCase(lastName)) {

                contacts.set(i, updatedContact);
                return true;
            }
        }
        return false;
    }

    // UC4: Delete contact
    public boolean deleteContact(String firstName, String lastName) {

        Iterator<Contact> iterator = contacts.iterator();

        while (iterator.hasNext()) {
            Contact contact = iterator.next();

            if (contact.getFirstName().equalsIgnoreCase(firstName)
                    && contact.getLastName().equalsIgnoreCase(lastName)) {

                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void displayContacts() {
        contacts.forEach(System.out::println);
    }
}
