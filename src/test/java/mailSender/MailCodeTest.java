package mailSender;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailCodeTest {
    MailCode mailCode = MailCode.HAPPY_BIRTHDAY;

    @Test
    void generateText() {
        assertEquals(mailCode.generateText(), "Hi, %NAME%!\nHappy %AGE%-th anniversary!\n");
    }
}