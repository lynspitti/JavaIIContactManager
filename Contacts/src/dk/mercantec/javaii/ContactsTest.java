package dk.mercantec.javaii;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContactsTest {
    Contacts contacts = new Contacts();

    @Test
    public void testAddInternalContact() throws Exception {
        contacts.AddInternalContact("Daniel", "50758618", "lynspitti@hotmail.com", "Home");
        assertTrue(contacts.getContacts().toArray().length > 0);
        assertTrue(contacts.getContacts().get(0).getName() == "Daniel");
    }

    @Test
    public void testGetContacts() throws Exception {
        contacts.AddInternalContact("Daniel", "50758618", "lynspitti@hotmail.com", "Home");
        assertTrue(contacts.getContacts().toArray().length > 0);
        assertTrue(contacts.getContacts().get(0).getName() == "Daniel");
    }

    @Test
    public void testAddExternalContact() throws Exception {
        contacts.AddExternalContact("Daniel", "50758618", "lynspitti@hotmail.com", "Lynspitti");
        assertTrue(contacts.getContacts().toArray().length > 0);
        assertTrue(contacts.getContacts().get(0).getName() == "Daniel");
    }
}