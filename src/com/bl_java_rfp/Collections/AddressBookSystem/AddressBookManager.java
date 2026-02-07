package com.bl_java_rfp.Collections.AddressBookSystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * UC6 & UC8 - Address Book Manager
 * Supports searching contacts across address books.
 */
public class AddressBookManager {

    private Map<String, AddressBook> addressBookMap = new HashMap<>();

    public boolean addAddressBook(String name, AddressBook addressBook) {

        if (addressBookMap.containsKey(name)) {
            return false;
        }

        addressBookMap.put(name, addressBook);
        return true;
    }

    public AddressBook getAddressBook(String name) {
        return addressBookMap.get(name);
    }

    public void displayAddressBooks() {
        for (String name : addressBookMap.keySet()) {
            System.out.println("Address Book Name: " + name);
        }
    }

    // UC8: Search persons by city
    public List<Contact> searchPersonsByCity(String city) {

        return addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(contact -> contact.toString().toLowerCase().contains(city.toLowerCase()))
                .collect(Collectors.toList());
    }

    // UC8: Search persons by state
    public List<Contact> searchPersonsByState(String state) {

        return addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(contact -> contact.toString().toLowerCase().contains(state.toLowerCase()))
                .collect(Collectors.toList());
    }
}
