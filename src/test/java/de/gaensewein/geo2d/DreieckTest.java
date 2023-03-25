package de.gaensewein.geo2d;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DreieckTest {
    

    @Test
    public void testFlaeche() {
        Dreieck d = new Dreieck(0, 0, 3, 4, 5);
        assertEquals(d.flaeche(), 6.0, 0.0001); 
    }

    @Test
    public void testToString() {
        Dreieck d = new Dreieck(0, 0, 3, 4, 5);
        assertEquals(d.toString(), "Dreieck: X: 0.0 Y: 0.0 A: 3.0 B: 4.0 C: 5.0");
    }

}
