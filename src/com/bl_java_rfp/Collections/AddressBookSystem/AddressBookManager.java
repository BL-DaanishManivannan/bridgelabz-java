package com.bl_java_rfp.Collections.AddressBookSystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * UC6–UC10 - Address Book Manager
 * Manages multiple address books with search, grouping, and counting.
 */
public class AddressBookManager {

    private Map<String, AddressBook> addressBookMap = new HashMap<>();

    // UC6
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

    // UC8
    public List<Contact> searchPersonsByCity(String city) {
        return addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(contact -> contact.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    public List<Contact> searchPersonsByState(String state) {
        return addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(contact -> contact.getState().equalsIgnoreCase(state))
                .collect(Collectors.toList());
    }

    // UC9
    public Map<String, List<Contact>> viewPersonsByCity() {
        return addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .collect(Collectors.groupingBy(Contact::getCity));
    }

    public Map<String, List<Contact>> viewPersonsByState() {
        return addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .collect(Collectors.groupingBy(Contact::getState));
    }

    // UC10: Count persons by city
    public Map<String, Long> countPersonsByCity() {
        return addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .collect(Collectors.groupingBy(
                        Contact::getCity,
                        Collectors.counting()
                ));
    }

    // UC10: Count persons by state
    public Map<String, Long> countPersonsByState() {
        return addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .collect(Collectors.groupingBy(
                        Contact::getState,
                        Collectors.counting()
                ));
    }
}
