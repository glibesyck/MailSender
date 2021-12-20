package mailSender;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Client firstClient = new Client("Someone", "18", Gender.MALE, "someone@ucu.edu.ua");
    Client secondClient = new Client("SomeoneNew", "20", Gender.FEMALE, "someone_new@ucu.edu.ua");

    @Test
    void getId() {
        assertEquals(firstClient.getId(), 2);
        assertEquals(secondClient.getId(), 3);

    }
}