package dk.mercantec.javaii;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class UITest {
    UI ui = new UI(new Contacts());

    @Test
    public void testMainMenu() throws Exception {
        Menu Mainmenu = ui.MainMenu();
        //could ether test on Mainmenu.show prints or
        //create a Mainmenu.length witch returns Menu.{ArrayList<MenuItem>(items)}.lenght
    }

    @Test
    public void testListContactsMenu() throws Exception {
        Menu Listmenu = ui.ListContactsMenu();
    }

    @Test
    public void testAddContactsMenu() throws Exception {
        Menu AddConMenu = ui.AddContactsMenu();
    }

    @Test
    public void testAddExternalContact() throws Exception {
        String message = "test";
        ByteArrayInputStream test = new ByteArrayInputStream("".getBytes());
        //System.in(new ByteArrayInputStream(message.getBytes()));

    }

    @Test
    public void testAddInternalContact() throws Exception {
        String name = "Daniel";
        String phone = "50758618";
        String email = "lynspitti@hotmail.com";
        String Dep = "Home";
        //System.setIn(new ByteArrayInputStream(name.getBytes()));
        //System.setIn(new ByteArrayInputStream(phone.getBytes()));
        //System.setIn(new ByteArrayInputStream(email.getBytes()));
        //System.setIn(new ByteArrayInputStream(Dep.getBytes()));

        ui.AddInternalContact();

        //ByteArrayOutputStream tester = new ByteArrayOutputStream(message.getBytes());
        //System.setOut(PrintStream(new ByteArrayOutputStream(message.getBytes())));
    }
}