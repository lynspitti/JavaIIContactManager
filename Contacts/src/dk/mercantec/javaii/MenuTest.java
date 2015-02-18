package dk.mercantec.javaii;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class MenuTest {
    Menu menu = new Menu();

    @Test
    public void testAdd() throws Exception {
        menu.Add("Test",new MenuCallback() {
            public void Invoke() {
            }
        });
        //gik lidt i stå har en løsning... men gik videre for at vende tilbage efter at have tænkt lidt
    }

    @Test
    public void testShow() throws Exception {

    }
}