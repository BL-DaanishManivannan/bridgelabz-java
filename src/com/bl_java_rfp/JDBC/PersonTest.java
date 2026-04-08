import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    // UC1 - Creation
    @Test
    void givenPersonDetails_shouldCreatePerson() {
        Person p = new Person("Daanish", "M",
                "Addr", "Chennai", "TN", "1", "1");

        assertEquals("Daanish", p.getFirstName());
        assertEquals("Chennai", p.getCity());
    }

    // UC6 - Equality (duplicate logic base)
    @Test
    void givenSameNamePersons_shouldBeEqual() {
        Person p1 = new Person("Daanish", "M", "", "", "", "", "");
        Person p2 = new Person("Daanish", "M", "", "", "", "", "");

        assertEquals(p1, p2);
    }

    // toString validation (UC7)
    @Test
    void givenPerson_whenToString_shouldReturnFormattedString() {
        Person p = new Person("Daanish", "M", "", "Chennai", "", "", "");
        assertTrue(p.toString().contains("Daanish"));
    }
}