package mail_sender;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {

    @Test
    void getMailText() {
        Client client = new Client("Arman", 19, Gender.BOY);
        MailInfo mailInfo = new MailInfo(client, MailCode.HAPPY_BIRTHDAY);
        MailCode mailCode = mailInfo.getMailCode();
        assertEquals("Happy birthday, Arman! BOY, be happy in your 19!", mailInfo.getMailText());
    }
}