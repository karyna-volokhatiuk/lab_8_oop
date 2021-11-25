package mail_sender;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {

    @Test
    void addMailInfo() {
        MailBox mailBox = new MailBox();
        MailInfo mailInfo1 = new MailInfo();
        MailInfo mailInfo2 = new MailInfo();
        assertTrue(mailBox.getInfos().isEmpty());
        mailBox.addMailInfo(mailInfo1);
        assertEquals(1, mailBox.getInfos().size());
        mailBox.addMailInfo(mailInfo2);
        assertEquals(2, mailBox.getInfos().size());
    }
}