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

/**
 * eine Ellipse
 */
public class Ellipse extends GeoObjekt {
    private double a;
    private double b;

    /**
     * Erstelle eine (aufrecht stehende) Ellipse 
     * @param xx X-Koordinate des Mittelpunktes
     * @param yy Y-Koordinate des Mittelpunktes
     * @param aa Halbachse a 
     * @param bb Halbachse b 
     */
    public Ellipse(double xx, double yy, double aa, double bb) {
        super(xx, yy);
        setA(aa);
        setB(bb);
    }

    public void setA(double neu_a) {
        a = neu_a;
    }

    public double getA() {
        return a;
    }

    public void setB(double neu_b) {
        b = neu_b;
    }

    public double getB() {
        return b;
    }

    public double flaeche() {
        return Math.PI * a * b;
    }

    public boolean in(double xx, double yy) {
        if (Math.pow((xx - x) / a, 2) + Math.pow((yy - y) / b, 2) <= 1) {
            return true;
        }
        return false;
    }

    public String toString() {
        return super.toString() + " A: " + a + " B: " + b;
    }
}
