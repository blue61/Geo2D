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
 * ein Punkt
 */
public class Punkt extends GeoObjekt {

    /**
     * erzeuge einen neuen Punkt
     * @param xx X-Position
     * @param yy Y-Position
     */
    public Punkt(double xx, double yy) {
        super(xx, yy);
    }

    /**
     * berechne die Fläche
     * @return Fläche
     * ein Punkt hat keine Ausdehnung, daher ist die Fläche 0
     */
    public double flaeche() {
        return 0;
    }

    public String toString() {
        return super.toString();
    }

    public boolean in (double x, double y) {
        if (x == getX() && y == getY()) {
            return true;
        }
        return false;
    }
    
}
