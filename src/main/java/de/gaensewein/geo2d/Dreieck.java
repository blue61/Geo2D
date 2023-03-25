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
 * ein Dreieck
 */
public class Dreieck extends GeoObjekt {

    private double a;
    private double b;
    private double c;

    /**
     * create a new triangle
     * @param xx X-Position of the center
     * @param yy Y-Position of the center
     * @param aa length of side a
     * @param bb length of side b
     * @param cc length of side c
     */
    public Dreieck(double xx, double yy, double aa, double bb, double cc) {
        super(xx, yy);
        setA(aa);
        setB(bb);
        setC(cc);
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

    public void setC(double cc) {
        c = cc;
    }

    public double getC() {
        return c;
    }

    public double flaeche() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public String toString() {
        return super.toString() + " A: " + a + " B: " + b + " C: " + c;
    }

    public boolean in (double x, double y) {
        double s = (a + b + c) / 2;
        double s1 = (a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(c))) / 2;
        double s2 = (a + c + Math.sqrt(Math.pow(a, 2) + Math.pow(c, 2) - 2 * a * c * Math.cos(b))) / 2;
        double s3 = (b + c + Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2) - 2 * b * c * Math.cos(a))) / 2;
        if (s == s1 + s2 + s3) {
            return true;
        }
        return false;
    }
    
}
