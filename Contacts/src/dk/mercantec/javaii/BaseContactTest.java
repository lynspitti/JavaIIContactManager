package dk.mercantec.javaii;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaseContactTest {
    String name = "Daniel";
    String phone = "50758618";
    String email = "lynspitti@hotmail.com";
    BaseContact contact = new BaseContact(name,phone,email);
    @Test
    public void testGetPhone() throws Exception {
        assertSame(contact.getPhone(), phone);
    }

    @Test
    public void testSetPhone() throws Exception {
        contact.setPhone("18867550");
        assertNotSame(contact.getPhone(), phone);
        assertSame(contact.getPhone(), "18867550");
    }

    @Test
    public void testGetEmail() throws Exception {
        assertSame(contact.getEmail(), email);
    }

    @Test
    public void testSetEmail() throws Exception {
        contact.setEmail("not@hotmail.com");
        assertNotSame(contact.getEmail(), email);
        assertSame(contact.getEmail(), "not@hotmail.com");
    }

    @Test
    public void testGetName() throws Exception {
        assertSame(contact.getName(), name);
    }

    @Test
    public void testSetName() throws Exception {
        contact.setName("notdaniel");
        assertNotSame(contact.getName(), name);
        assertSame(contact.getName(), "notdaniel");
    }
}