import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookMainTest {

    @Test
    void givenProgramStarts_shouldDisplayWelcomeMessage() {
        AddressBookMain main = new AddressBookMain();
        assertEquals("Welcome to Address Book Program", main.getWelcomeMessage());
    }
}