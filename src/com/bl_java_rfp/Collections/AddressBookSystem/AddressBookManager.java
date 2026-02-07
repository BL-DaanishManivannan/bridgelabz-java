package com.bl_java_rfp.Collections.AddressBookSystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * UC6–UC9 - Address Book Manager
 * Manages multiple address books and supports search & grouping.
 */
public class AddressBookManager {

    private Map<String, AddressBook> addressBookMap = new HashMap<>();

    // UC6: Add address book
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

    // UC8: Search by city
    public List<Contact> searchPersonsByCity(String city) {
        return addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(contact -> contact.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    // UC8: Search by state
    public List<Contact> searchPersonsByState(String state) {
        return addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(contact -> contact.getState().equalsIgnoreCase(state))
                .collect(Collectors.toList());
    }

    // UC9: View grouped by city
    public Map<String, List<Contact>> viewPersonsByCity() {
        return addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .collect(Collectors.groupingBy(Contact::getCity));
    }

    // UC9: View grouped by state
    public Map<String, List<Contact>> viewPersonsByState() {
        return addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .collect(Collectors.groupingBy(Contact::getState));
    }
}
