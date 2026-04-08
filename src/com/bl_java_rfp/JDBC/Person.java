public class Person {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;

    public Person(String firstName, String lastName,
                  String address, String city,
                  String state, String zip,
                  String phoneNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }
    public String getAddress() { return address; }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;
        return firstName.equals(person.firstName) &&
                lastName.equals(person.lastName);
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + " - " + city;
    }
    public String getState() { return state; }
    public String getZip() { return zip; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getCity() { return city; }
}