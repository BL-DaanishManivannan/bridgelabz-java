import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    // UC2 + UC5
    @Test
    void givenMultiplePersons_shouldBeAdded() {
        AddressBook ab = new AddressBook();

        ab.addPerson(new Person("D1", "M", "", "Chennai", "TN", "1", "1"));
        ab.addPerson(new Person("D2", "M", "", "Bangalore", "KA", "2", "2"));

        assertEquals(2, ab.getPersonCount());
    }

    // UC6
    @Test
    void givenDuplicatePerson_shouldNotBeAdded() {
        AddressBook ab = new AddressBook();

        ab.addPerson(new Person("D1", "M", "", "C", "TN", "1", "1"));
        ab.addPerson(new Person("D1", "M", "", "C", "TN", "2", "2"));

        assertEquals(1, ab.getPersonCount());
    }

    // UC3
    @Test
    void givenPerson_whenEdited_shouldUpdateAddress() {
        AddressBook ab = new AddressBook();

        Person p = new Person("D1", "M", "Old", "C", "TN", "1", "1");
        ab.addPerson(p);

        ab.editPerson("D1", "New");

        assertEquals("New", p.getAddress());
    }

    // UC4
    @Test
    void givenPerson_whenDeleted_shouldBeRemoved() {
        AddressBook ab = new AddressBook();

        ab.addPerson(new Person("D1", "M", "", "C", "TN", "1", "1"));
        ab.deletePerson("D1");

        assertEquals(0, ab.getPersonCount());
    }

    // UC7
    @Test
    void givenPersons_whenSortedByName_shouldBeOrdered() {
        AddressBook ab = new AddressBook();

        ab.addPerson(new Person("Z", "M", "", "C", "TN", "1", "1"));
        ab.addPerson(new Person("A", "K", "", "B", "KA", "2", "2"));

        ab.sortByName();

        assertEquals("A", ab.getPersons().get(0).getFirstName());
    }

    // UC8
    @Test
    void givenPersons_whenSortedByCity_shouldBeOrdered() {
        AddressBook ab = new AddressBook();

        ab.addPerson(new Person("A", "M", "", "Chennai", "TN", "1", "1"));
        ab.addPerson(new Person("B", "K", "", "Bangalore", "KA", "2", "2"));

        ab.sortByCity();

        assertEquals("Bangalore", ab.getPersons().get(0).getCity());
    }

    // UC9
    @Test
    void givenPersons_whenGroupedByCity_shouldReturnCorrectCount() {
        AddressBook ab = new AddressBook();

        ab.addPerson(new Person("A", "M", "", "Chennai", "TN", "1", "1"));
        ab.addPerson(new Person("B", "M", "", "Chennai", "TN", "2", "2"));

        assertEquals(2, ab.getPersonsByCity().get("Chennai").size());
    }

    // UC10
    @Test
    void givenPersons_whenSearchedByCity_shouldReturnResults() {
        AddressBook ab = new AddressBook();

        ab.addPerson(new Person("A", "M", "", "Chennai", "TN", "1", "1"));
        ab.addPerson(new Person("B", "M", "", "Bangalore", "KA", "2", "2"));

        assertEquals(1, ab.searchByCity("Chennai").size());
    }

    // UC11–15 (basic validation)
    @Test
    void givenIOOperations_shouldNotThrow() {
        AddressBook ab = new AddressBook();
        ab.addPerson(new Person("A", "M", "", "C", "TN", "1", "1"));

        assertDoesNotThrow(() -> ab.writeToJson("test.json"));
        assertDoesNotThrow(() -> ab.writeToCSV("test.csv"));
        assertDoesNotThrow(() -> ab.writeToJsonGson("test.json"));
        assertDoesNotThrow(ab::saveToServer);
        assertDoesNotThrow(() -> ab.asyncWrite(() -> {}));
    }
}