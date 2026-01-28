package com.bl_java_rfp.OOPS_Concepts.AddressBook;

import java.util.ArrayList;

public class AddressBook {

    private ArrayList<ContactPerson> contactList;

    public AddressBook() {
        contactList = new ArrayList<>();
    }

    public void addContact(ContactPerson contact) {
        contactList.add(contact);
        System.out.println("Contact added successfully");
    }
    public void editContact(String firstName,
                            String address,
                            String city,
                            String state,
                            int zip,
                            long phoneNumber,
                            String email) {

        for (ContactPerson contact : contactList) {
            if (contact.getFirstName().equals(firstName)) {

                contact.setAddress(address);
                contact.setCity(city);
                contact.setState(state);
                contact.setZip(zip);
                contact.setPhoneNumber(phoneNumber);
                contact.setEmail(email);

                System.out.println("Contact updated successfully");
                return;
            }
        }

        System.out.println("Contact not found");
    }
}
