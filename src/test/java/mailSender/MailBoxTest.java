package mailSender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {
    MailBox mailBox = new MailBox();
    Client firstClient = new Client("Someone", "18", Gender.MALE, "someone@ucu.edu.ua");
    MailInfo mailInfo = new MailInfo(firstClient, MailCode.HAPPY_BIRTHDAY);
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void addMailInfo() {
        mailBox.addMailInfo(mailInfo);
        assertEquals(mailBox.getInfos().size(), 1);
    }

    @Test
    void sendAll() {
        mailBox.addMailInfo(mailInfo);
        mailBox.sendAll();
        assertEquals(outputStreamCaptor.toString().trim(), "We send a letter for someone@ucu.edu.ua");
    }
}