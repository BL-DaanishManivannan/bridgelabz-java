package com.bl_java_rfp.Collections.AddressBookSystem;

import java.util.HashMap;
import java.util.Map;

/**
 * UC6 - Address Book Manager
 * Manages multiple address books using Map.
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
}
