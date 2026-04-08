import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

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
}