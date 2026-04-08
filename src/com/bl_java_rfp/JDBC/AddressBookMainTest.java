import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddressBookMainTest {

    @Test
    void givenProgramStarts_shouldDisplayWelcomeMessage() {
        AddressBookMain main = new AddressBookMain();
        String message = main.getWelcomeMessage();
        assertEquals("Welcome to Address Book Program", message);
    }
}