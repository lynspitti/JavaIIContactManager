package dk.mercantec.javaii;

import org.junit.Test;

import static org.junit.Assert.*;

public class InternalTest {
    String name = "D";
    String phone = "5";
    String email = "H";
    String dep = "Home";
    Internal internal = new Internal(name,phone,email,dep);

    @Test
    public void testGetCompany() throws Exception {
        assertSame(internal.getDepartment(),dep);
    }

    @Test
    public void testSetCompany() throws Exception {
        internal.setDepartment("NotHome");
        assertNotSame(internal.getDepartment(),dep);
        assertSame(internal.getDepartment(),"NotHome");
    }

    @Test
    public void testToString() throws Exception {
        String test = internal.toString();
        assertEquals(test.split(":")[1].split("\n")[0].trim(), name);
        assertEquals(test.split(":")[2].split("\n")[0].trim(), phone);
        assertEquals(test.split(":")[3].split("\n")[0].trim(), email);
        assertEquals(test.split(":")[4].split("\n")[0].trim(), dep);
    }
}