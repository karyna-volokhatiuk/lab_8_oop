package mail_sender;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void getId() {
        Client cl1 = new Client();
        Client cl2 = new Client();
        //2 and 3, because in another test client with ID 1 is already created
        assertEquals(2, cl1.getId());
        assertEquals(3, cl2.getId());
    }
}