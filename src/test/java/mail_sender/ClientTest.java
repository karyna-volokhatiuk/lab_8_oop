package mail_sender;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void getId() {
        Client cl1 = new Client();
        Client cl2 = new Client();

        assertEquals(1, cl1.getId());
        assertEquals(2, cl2.getId());
    }
}