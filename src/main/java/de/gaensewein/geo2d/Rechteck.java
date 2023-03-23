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

public class Rechteck extends GeoObjekt{

    private double a;
    private double b;

    /**
     * Erstelle ein Rechteck
     * @param xx X-Position des Mittelpunkts
     * @param yy Y-Position des Mittelpunkts
     * @param aa Kantenlänge in X-Richtung
     * @param bb Kantenlänge in Y-Richtung
     */
    public Rechteck(double xx, double yy, double aa, double bb ) {
        super(xx, yy);
        setA(aa);
        setB(bb);

    }

    public void setA(double aa) {
        a = aa;
    }

    public double getA() {
        return a;
    }

    public void setB(double bb) {
        b = bb;
    }

    public double getB() {
        return b;
    }
    
    public double flaeche() {
        return a * b;
    }

    public boolean in(double xx, double yy) {
        if (xx >= x - a / 2 && xx <= x + a / 2 && yy >= y - b / 2 && yy <= y + b / 2) {
            return true;
        }
        return false;
    }

    public String toString( ) {
        return super.toString() + " A: " + a + " B: " + b;
    }
}
