import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    // ✅ UC0 - Welcome Message
    @Test
    void givenProgramStarts_shouldDisplayWelcomeMessage() {
        AddressBookMain main = new AddressBookMain();
        String message = main.getWelcomeMessage();
        assertEquals("Welcome to Address Book Program", message);
    }

    // ✅ UC1 - Create Person
    @Test
    void givenPersonDetails_shouldCreatePersonObject() {
        Person person = new Person(
                "Daanish", "M",
                "Street 1", "Chennai",
                "TN", "600001",
                "9999999999"
        );

        assertEquals("Daanish", person.getFirstName());
        assertEquals("M", person.getLastName());
        assertEquals("Chennai", person.getCity());
    }

    // ✅ UC2 - Add Person
    @Test
    void givenPerson_shouldBeAddedToAddressBook() {
        AddressBook addressBook = new AddressBook();

        Person person = new Person(
                "Daanish", "M",
                "Street 1", "Chennai",
                "TN", "600001",
                "9999999999"
        );

        addressBook.addPerson(person);

        assertEquals(1, addressBook.getPersonCount());
    }

    // ✅ UC3 - Edit Person
    @Test
    void givenPerson_whenEdited_shouldUpdateDetails() {
        AddressBook addressBook = new AddressBook();

        Person person = new Person(
                "Daanish", "M",
                "Old Street", "Chennai",
                "TN", "600001",
                "9999999999"
        );

        addressBook.addPerson(person);

        addressBook.editPerson("Daanish", "New Street");

        assertEquals("New Street", person.getAddress());
    }

    // ✅ UC4 - Delete Person
    @Test
    void givenPerson_whenDeleted_shouldRemoveFromAddressBook() {
        AddressBook addressBook = new AddressBook();

        Person person = new Person(
                "Daanish", "M",
                "Street 1", "Chennai",
                "TN", "600001",
                "9999999999"
        );

        addressBook.addPerson(person);
        addressBook.deletePerson("Daanish");

        assertEquals(0, addressBook.getPersonCount());
    }
    @Test
    void givenMultiplePersons_shouldBeAddedToAddressBook() {
        AddressBook addressBook = new AddressBook();

        Person p1 = new Person("Daanish", "M",
                "Street 1", "Chennai", "TN", "600001", "1111111111");

        Person p2 = new Person("Alex", "K",
                "Street 2", "Bangalore", "KA", "560001", "2222222222");

        addressBook.addPerson(p1);
        addressBook.addPerson(p2);

        assertEquals(2, addressBook.getPersonCount());
    }
    @Test
    void givenDuplicatePerson_whenAdded_shouldNotBeAdded() {
        AddressBook addressBook = new AddressBook();

        Person p1 = new Person("Daanish", "M",
                "Street 1", "Chennai", "TN", "600001", "1111111111");

        Person p2 = new Person("Daanish", "M",
                "Street 2", "Chennai", "TN", "600001", "2222222222");

        addressBook.addPerson(p1);
        addressBook.addPerson(p2); // duplicate

        assertEquals(1, addressBook.getPersonCount());
    }
    @Test
    void givenMultiplePersons_whenSortedByName_shouldReturnSortedOrder() {
        AddressBook addressBook = new AddressBook();

        Person p1 = new Person("Zara", "M",
                "Street 1", "Chennai", "TN", "600001", "1111111111");

        Person p2 = new Person("Alex", "K",
                "Street 2", "Bangalore", "KA", "560001", "2222222222");

        addressBook.addPerson(p1);
        addressBook.addPerson(p2);

        addressBook.sortByName();

        // After sorting → Alex should be first
        assertEquals("Alex", addressBook.getPersons().get(0).getFirstName());
    }
    @Test
    void givenMultiplePersons_whenSortedByCity_shouldReturnSortedOrder() {
        AddressBook addressBook = new AddressBook();

        Person p1 = new Person("Daanish", "M",
                "Street 1", "Chennai", "TN", "600001", "1111111111");

        Person p2 = new Person("Alex", "K",
                "Street 2", "Bangalore", "KA", "560001", "2222222222");

        addressBook.addPerson(p1);
        addressBook.addPerson(p2);

        addressBook.sortByCity();

        // Bangalore comes before Chennai
        assertEquals("Bangalore", addressBook.getPersons().get(0).getCity());
    }
    @Test
    void givenPersons_whenViewedByCity_shouldGroupCorrectly() {
        AddressBook addressBook = new AddressBook();

        Person p1 = new Person("Daanish", "M",
                "Street 1", "Chennai", "TN", "600001", "1111111111");

        Person p2 = new Person("Alex", "K",
                "Street 2", "Chennai", "TN", "600002", "2222222222");

        addressBook.addPerson(p1);
        addressBook.addPerson(p2);

        var cityMap = addressBook.getPersonsByCity();

        assertEquals(2, cityMap.get("Chennai").size());
    }
}