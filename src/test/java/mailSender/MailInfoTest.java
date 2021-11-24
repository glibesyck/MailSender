package mailSender;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {
    Client firstClient = new Client("Someone", "18", Gender.MALE, "someone@ucu.edu.ua");
    MailInfo mailInfo = new MailInfo(firstClient, MailCode.HAPPY_BIRTHDAY);

    @Test
    void getClientText() {
        assertEquals(mailInfo.getClientText(), "Hi, Someone!\nHappy 18-th anniversary!\n");
    }
}