import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

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
}