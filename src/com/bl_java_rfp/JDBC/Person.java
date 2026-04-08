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

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getCity() { return city; }
}