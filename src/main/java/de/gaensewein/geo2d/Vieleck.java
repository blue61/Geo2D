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


public class Vieleck extends GeoObjekt {

	// Anzahl der Ecken
	private int anzahlEcken;

    // Radius
    private double radius;

	public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
	 * Erstelle ein Vieleck
	 * @param xx X-Position des Mittelpunkts
	 * @param yy Y-Position des Mittelpunkts
	 * @param aa Anzahl der Ecken
	 */
	public Vieleck(double xx, double yy, int anzahlEcken, double radius) {
		super(xx, yy);
		setAnzahlEcken(anzahlEcken);
        setRadius(radius);
	}

	public void setAnzahlEcken(int aa) {
		anzahlEcken = aa;
	}

	public int getAnzahlEcken() {
		return anzahlEcken;
	}

	public double flaeche() {
        double h = Math.sqrt(2 * radius * radius * (1 - Math.cos(2 * Math.PI / anzahlEcken)));
        double a = radius * Math.sin(2 * Math.PI / anzahlEcken);
        return 0.5 * h * a * anzahlEcken;    
	}

	public boolean in(double x, double y) {
		if (Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y)) <= anzahlEcken) {
			return true;
		}
		return false;
	}

	public String toString( ) {
		return super.toString() + " n: " + anzahlEcken + " R: " + radius;
	}
    
}
