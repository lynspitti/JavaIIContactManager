package dk.mercantec.javaii;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ExternalTest {
    String name = "D";
    String phone = "5";
    String email = "H";
    String comp = "Lynspitti";
    External external = new External(name,phone,email,comp);

    @Test
    public void testGetCompany() throws Exception {
        assertSame(external.getCompany(),comp);
    }

    @Test
    public void testSetCompany() throws Exception {
        external.setCompany("NotLynspitti");
        assertNotSame(external.getCompany(),comp);
        assertSame(external.getCompany(),"NotLynspitti");
    }

    @Test
    public void testToString() throws Exception {
        String test = external.toString();
        assertEquals(test.split(":")[1].split("\n")[0].trim(), name);
        assertEquals(test.split(":")[2].split("\n")[0].trim(), phone);
        assertEquals(test.split(":")[3].split("\n")[0].trim(), email);
        assertEquals(test.split(":")[4].split("\n")[0].trim(), comp);
    }
}