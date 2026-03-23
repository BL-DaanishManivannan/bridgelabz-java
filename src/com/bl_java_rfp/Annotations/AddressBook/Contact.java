package com.bl_java_rfp.Annotations.AddressBook;

import com.opencsv.bean.CsvBindByName;

public class Contact {

    @CsvBindByName(column = "firstName")
    private String firstName;

    @CsvBindByName(column = "lastName")
    private String lastName;

    @CsvBindByName(column = "address")
    private String address;

    @CsvBindByName(column = "city")
    private String city;

    @CsvBindByName(column = "state")
    private String state;

    @CsvBindByName(column = "zip")
    private String zip;

    @CsvBindByName(column = "phoneNumber")
    private String phoneNumber;

    @CsvBindByName(column = "email")
    private String email;

    // OpenCSV requires a no-arg constructor
    public Contact() {}

    public Contact(String firstName, String lastName, String address,
                   String city, String state, String zip,
                   String phoneNumber, String email) {
        this.firstName   = firstName;
        this.lastName    = lastName;
        this.address     = address;
        this.city        = city;
        this.state       = state;
        this.zip         = zip;
        this.phoneNumber = phoneNumber;
        this.email       = email;
    }

    public String getFirstName()   { return firstName; }
    public String getLastName()    { return lastName; }
    public String getAddress()     { return address; }
    public String getCity()        { return city; }
    public String getState()       { return state; }
    public String getZip()         { return zip; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail()       { return email; }

    public void setFirstName(String firstName)     { this.firstName = firstName; }
    public void setLastName(String lastName)       { this.lastName = lastName; }
    public void setAddress(String address)         { this.address = address; }
    public void setCity(String city)               { this.city = city; }
    public void setState(String state)             { this.state = state; }
    public void setZip(String zip)                 { this.zip = zip; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setEmail(String email)             { this.email = email; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contact contact = (Contact) obj;
        return firstName.equalsIgnoreCase(contact.firstName)
                && lastName.equalsIgnoreCase(contact.lastName);
    }

    @Override
    public int hashCode() {
        return (firstName + lastName).toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return "Contact: " + firstName + " " + lastName
                + " | Address: " + address
                + " | City: " + city
                + " | State: " + state
                + " | Zip: " + zip
                + " | Phone: " + phoneNumber
                + " | Email: " + email;
    }
}