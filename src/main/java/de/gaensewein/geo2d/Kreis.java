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

public class Kreis extends GeoObjekt {

	// Radius
	private double radius;

	/**
	 * Erstelle einen Kreis
	 * @param xx X-Position des Mittelpunkts
	 * @param yy Y-Position des Mittelpunkts
	 * @param rr Radius
	 */
	public Kreis(double xx, double yy, double rr) {
		super(xx, yy);
		setR(rr);
	}

	public void setR(double rr) {
		radius = rr;
	}

	public double getR() {
		return radius;
	}

	public double flaeche() {
		return radius * radius * Math.PI;
	}

	public boolean in(double x, double y) {
		if (Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y)) <= radius) {
			return true;
		}
		return false;
	}

	public String toString( ) {
		return super.toString() + " R: " + radius;
	}

}
