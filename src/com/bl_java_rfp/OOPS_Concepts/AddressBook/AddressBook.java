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
}
