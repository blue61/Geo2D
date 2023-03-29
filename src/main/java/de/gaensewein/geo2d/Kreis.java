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
 * ein Kreis
 */
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

	/**
	 * Prüfe, ob ein Punkt innerhalb des Kreises liegt
	 * @param xx X-Position des Punktes
	 * @param yy Y-Position des Punktes
	 * @return true, wenn der Punkt innerhalb des Kreises liegt
	 */
	public boolean in(double xx, double yy) {
		if (Math.sqrt((xx - x) * (xx - x) + (yy - y) * (yy - y)) <= radius) {
			return true;
		}
		return false;
	}

	public String toString( ) {
		return super.toString() + " R: " + radius;
	}

}
