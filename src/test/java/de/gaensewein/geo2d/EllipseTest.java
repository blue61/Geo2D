/*
 * This file is part of the Geo2D project.
 * The Geo2D project contains an arbitrary number of geometric objects and their data.
 * No warranty is given, especially not for correctness or efficiency.
 * If you need any help in reading the german comments look at www.leo.org for translations.
 * Assembled by Thomas Nagel.
 * 
 * Dies ist Open Source Software
 * Diese Bibliothek besteht aus Texten, die zum größten Teil von Github Copilot generiert wurden.
 * Es werden keinerlei Garantien übernommen, insbesondere nicht für Korrektheit oder Effizienz.
 * Diese Programmtexte dienen ausschließlich der Illustration der Möglichkeiten von Github Copilot 
 * und ähnlicher KI Software. Für die Rechte zu Kopien gelten daher im Zweifelsfall die Benutzungsrechte 
 * zu von Github Copilot erzeugten Programmtexten.
 */
package de.gaensewein.geo2d;

import org.junit.Test;
import static org.junit.Assert.*;

public class EllipseTest {

    @Test
    public void testFlaeche() {
        System.out.println("flaeche");
        Ellipse instance = new Ellipse(0.0, 0.0, 2.0, 3.0);
        double expResult = 18.84955592153876;
        double result = instance.flaeche();
        //System.out.println("Fläche: " + result);
        assertEquals(expResult, result, 0.0001);
    }

    @Test
    public void testGetA() {
        System.out.println("getA");
        Ellipse instance = new Ellipse(0.0, 0.0, 2.0, 3.0);
        double expResult = 2.0;
        double result = instance.getA();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetA() {
        System.out.println("setA");
        double a = 2.0;
        Ellipse instance = new Ellipse(0.0, 0.0, 2.0, 3.0);
        instance.setA(a);
        double expResult = 2.0;
        double result = instance.getA();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetB() {
        System.out.println("getB");
        Ellipse instance = new Ellipse(0.0, 0.0, 2.0, 3.0);
        double expResult = 3.0;
        double result = instance.getB();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetB() {
        System.out.println("setB");
        double b = 3.0;
        Ellipse instance = new Ellipse(0.0, 0.0, 2.0, 3.0);
        instance.setB(b);
        double expResult = 3.0;
        double result = instance.getB();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Ellipse instance = new Ellipse(0.0, 0.0, 2.0, 3.0);
        String expResult = "Ellipse: X: 0.0 Y: 0.0 A: 2.0 B: 3.0";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    @Test
    public void TestIn() {
        System.out.println("In");
        Ellipse instance = new Ellipse(0.0, 0.0, 2.0, 3.0);
        Punkt p = new Punkt(1.0, 1.0);
        boolean expResult = true;
        boolean result = instance.in(p.x, p.y);
        assertEquals(expResult, result);
        Punkt p2 = new Punkt(20.0, 30.0);
        expResult = false;
        result = instance.in(p2.x, p2.y);
        assertEquals(expResult, result);
    }

}
